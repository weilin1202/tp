package seedu.address.logic.parser;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.DelEventCommand;
import seedu.address.logic.parser.exceptions.ParseException;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

/**
 * Parses input arguments and creates a new DeleteCommand object
 */
public class DelEventCommandParser implements Parser<DelEventCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the DelEventCommand
     * and returns a DelEventCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DelEventCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new DelEventCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, DelEventCommand.MESSAGE_USAGE), pe);
        }
    }

}
