public abstract class SchedulerUtil implements Runnable {

    private final int taskId;

    public SchedulerUtil(JavaPlugin plugin, int arg1, int arg2) {
        taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, this, arg1, arg2);
    }

    public void cancel() {
        Bukkit.getScheduler().cancelTask(taskId);
    }
}
