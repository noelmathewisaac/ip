import java.util.ArrayList;

class TaskList {


    ArrayList<Task> tasks;
    Ui ui = new Ui();

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    public ArrayList<Task> getTaskList() {
        return this.tasks;
    }

    public int size() {
        return tasks.size();
    }

    /**
     * Prints all the tasks in the task list
     */
    public void listTasks() {
        System.out.println(ui.FORMAT_LINE);
        System.out.println("You have the following task(s) in your list.");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println(i + 1 + "." + task.toString());

        }
        System.out.println(ui.FORMAT_LINE);

    }

    public void addTask(Task task) {
        tasks.add(task);

    }

    /**
     * Prints the newly added task details along with the new size of the task list
     *
     * @param task An instance of Task representing the newly added task
     */
    public void printAddedTask(Task task) {
        System.out.println(ui.FORMAT_LINE);
        System.out.println("Got it. I've added this task to your list:\n" +
                "   " + task.toString());
        System.out.println("Now you have " + tasks.size() + " task(s) in the list.");
        System.out.println(ui.FORMAT_LINE);


    }

    /**
     * Marks the indicated given task as done
     *
     * @param index An integer representing the index of the task to be marked as done
     */
    public void markAsDone(int index) {
        Task task = tasks.get(index);
        task.markAsDone();
        System.out.println(ui.FORMAT_LINE);
        System.out.println(" Good job! I've marked this task as done:\n" +
                "   " + task.toString());
        System.out.println(ui.FORMAT_LINE);

    }

    /**
     * Deletes the indicated task from the task list
     *
     * @param index An integer representing the index of the task to be deleted
     */
    public void deleteTask(int index) {
        Task task = tasks.get(index);
        tasks.remove(index);
        System.out.println(ui.FORMAT_LINE);
        System.out.println(" Noted. I've removed this task:\n" +
                "   " + task.toString());
        System.out.println("Now you have " + tasks.size() + " task(s) in the list.");
        System.out.println(ui.FORMAT_LINE);

    }
}