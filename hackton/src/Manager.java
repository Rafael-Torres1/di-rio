import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Manager{

    private List<Task> taskList;
    private int idcounter;

    public Manager(){
        this.taskList = new ArrayList<>();
        this.idcounter = 0;
    }

    public void addTaskUser(){
        Scanner in = new Scanner(System.in);

        System.out.print("type description: ");
        String description = in.nextLine();

        System.out.print("deadline: ");
        String dl = in.nextLine();
        LocalDate deadline = LocalDate.parse(dl);

        System.out.println("sucefull add");

        Task task = new Task();
        task.setId(idcounter++);
        task.setDescription(description);
        task.setDeadline(deadline);
        task.setDone(false);

        taskList.add(task);
    }

    public void showTask(){
        if(taskList.isEmpty()){
            System.out.println("no found task");
        }
        for (Task task : taskList){
            System.out.println(task);
        }
    }

    public void doneTask(int id ){
        for (Task task : taskList){
            if(task.getId() == id){
                task.setDone(true);
                System.out.println(taskList.get(id)+ " successful");
                return;
            }else {
                System.out.println("no found task");
            }

        }

    }



}