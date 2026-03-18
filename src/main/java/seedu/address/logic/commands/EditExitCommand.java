package seedu.address.logic.commands;

import seedu.address.logic.ParserMode;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;

public class EditExitCommand extends Command{

    public static final String COMMAND_WORD = "exitedit";
    public static final String MESSAGE_EXIT_EDITING_MODE_ACKNOWLEDGEMENT = "Exiting Editing mode as requested ...";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(MESSAGE_EXIT_EDITING_MODE_ACKNOWLEDGEMENT, false, ParserMode.NORMAL, false);
    }
}
