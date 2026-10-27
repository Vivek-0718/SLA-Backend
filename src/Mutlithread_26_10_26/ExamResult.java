package Mutlithread_26_10_26;

public class ExamResult {
    private boolean published = false;

    public synchronized void waitForResult(String student) {
        while (!published) {
            try {
                System.out.println(student + ": Waiting for result...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(student + ":Result received -> PASS");
    }

    public synchronized void publishResult() {
        published = true;
        System.out.println("Teacher: Result published. Calling notifyAll()");
        notifyAll();
    }
}

class resultDisplay {
    static void main() {
        ExamResult res = new ExamResult();
        Thread Student1 = new Thread(() -> res.waitForResult("Student 1"));
        Thread Student2 = new Thread(() -> res.waitForResult("Student 2"));
        Thread Student3 = new Thread(() -> res.waitForResult("Student 3"));
        Student1.start();
        Student2.start();
        Student3.start();

        new Thread(res::publishResult).start();
    }
}