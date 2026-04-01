package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import seedu.address.logic.commands.UpcomingCommand;
import seedu.address.model.person.Date;
import seedu.address.model.person.ReminderWithinOffsetPredicate;

public class UpcomingCommandParserTest {

    private UpcomingCommandParser parser = new UpcomingCommandParser();

    @Test
    public void parse_emptyArg_throwsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, UpcomingCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_nonIntArg_throwsParseException() {
        assertParseFailure(parser, " three  ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, UpcomingCommand.MESSAGE_INVALID_ARGS));
    }

    @Test
    public void parse_outOfRangeIntArg_throwsParseException() {
        assertParseFailure(parser, "   -12  ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, UpcomingCommand.MESSAGE_INVALID_ARGS));
    }

    @Test
    public void parse_validArgs_returnsFindCommand() {
        // no leading and trailing whitespaces
        Date sampleDate = new Date(LocalDate.now().plusDays(20));
        UpcomingCommand expectedUpcomingCommand =
                new UpcomingCommand(new ReminderWithinOffsetPredicate(sampleDate), 20);
        assertParseSuccess(parser, "20", expectedUpcomingCommand);

        // multiple whitespaces between keywords
        assertParseSuccess(parser, " \n 20 \n", expectedUpcomingCommand);
    }

}
