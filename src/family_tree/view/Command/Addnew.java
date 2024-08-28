package family_tree.view.Command;

import family_tree.view.ConsoleUI;

public class Addnew extends Command {
    public Addnew(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Добавить члена семьи";
    }

    @Override
    public void execute(){
        consoleUI.add();
    }
}
