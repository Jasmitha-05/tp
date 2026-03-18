package seedu.address.logic.commands;

import seedu.address.logic.ParserMode;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;

public class EditEnterCommand extends Command {

    public static final String COMMAND_WORD = "editmode";
    public static final String MESSAGE_ENTER_EDITING_MODE_ACKNOWLEDGEMENT = "Entering Editing mode as requested ...";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(MESSAGE_ENTER_EDITING_MODE_ACKNOWLEDGEMENT, false, ParserMode.EDITING, false);
    }
}
