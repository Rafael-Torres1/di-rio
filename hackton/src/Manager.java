import java.util.ArrayList;
import java.util.List;

class Manager{
    private List <Task> taskslist;

    public Manager(){
        this.taskslist = new ArrayList<>();
    }

    public void addTask(Task task){
        taskslist.add(task);

    }
    public void showTask(Task showtask){
        for (Task it : taskslist){
            if (it.getId() == showtask.getId()) {

            }
        }
    }
}