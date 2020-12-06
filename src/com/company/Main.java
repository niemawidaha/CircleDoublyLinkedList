package com.company;

public class Main {

    public static void main(String[] args) {

        // Creating linked list object for the tests:
        System.out.println("Circular Doubly Linked List Tests\n");
        System.out.println("--------------------------------------------------");


        // TEST 1: Inserting a job before the current job
        CircleDLL insertJobBeforeCurrent_START = new CircleDLL();   // A: Insert Job Before Current Job: START
        CircleDLL insertJobBeforeCurrent_MIDDLE = new CircleDLL();  // B: Insert Job Before Current Job: MIDDLE
        CircleDLL insertJobBeforeCurrent_END = new CircleDLL();     // C: Insert Job Before Current Job: END


        // TEST 1-A: Insert Job Before Current Job: START
        System.out.println("TEST 1-A: Inserting a job before the current job: At the Start\n");
        insertJobBeforeCurrent_START.insertAtStart("10");
        insertJobBeforeCurrent_START.insertAtStart("20");
        insertJobBeforeCurrent_START.insertAtStart("30");
        insertJobBeforeCurrent_START.insertAtStart("40");
        insertJobBeforeCurrent_START.insertAtStart("60");
        insertJobBeforeCurrent_START.insertAtStart("1000");
        insertJobBeforeCurrent_START.display();
        insertJobBeforeCurrent_START.insertBeforeCurrent("50");
        insertJobBeforeCurrent_START.display();
        System.out.println("--------------------------------------------------");
        System.out.println();

        // B: Insert Job Before Current Job: MIDDLE
        System.out.println("TEST 1-B: Inserting a job before the current job: In the Middle\n");
        insertJobBeforeCurrent_MIDDLE.insertAtStart("10");
        insertJobBeforeCurrent_MIDDLE.insertAtStart("20");
        insertJobBeforeCurrent_MIDDLE.insertAtStart("30");
        insertJobBeforeCurrent_MIDDLE.insertAtStart("40");
        insertJobBeforeCurrent_MIDDLE.insertAtStart("60");
        insertJobBeforeCurrent_MIDDLE.insertAtEnd("1000");
        insertJobBeforeCurrent_MIDDLE.display();
        insertJobBeforeCurrent_MIDDLE.insertBeforeCurrent("50");
        insertJobBeforeCurrent_MIDDLE.display();
        System.out.println("--------------------------------------------------");
        System.out.println();

        // C: Insert Job Before Current Job: END
        System.out.println("TEST 1-C: Inserting a job before the current job: At the End\n");
        insertJobBeforeCurrent_END.insertAtStart("10");
        insertJobBeforeCurrent_END.insertAtStart("20");
        insertJobBeforeCurrent_END.insertAtStart("30");
        insertJobBeforeCurrent_END.insertAtStart("40");
        insertJobBeforeCurrent_END.insertAtStart("60");
        insertJobBeforeCurrent_END.insertAtEnd("1000");
        insertJobBeforeCurrent_END.display();
        insertJobBeforeCurrent_END.insertBeforeCurrent("50");
        insertJobBeforeCurrent_END.display();
        System.out.println("--------------------------------------------------");
        System.out.println();

        // TEST 2: Deleting the current job:
        CircleDLL deleteJobBeforeCurrent_START = new CircleDLL();   // A: Deleting Job Before Current Job: START
        CircleDLL deleteJobBeforeCurrent_MIDDLE = new CircleDLL();  // B: Deleting Job Before Current Job: MIDDLE
        CircleDLL deleteJobBeforeCurrent_END = new CircleDLL();     // C: Deleting Job Before Current Job: END

        // TEST 2-A: Deleting Job Before Current Job: START
        System.out.println("TEST 2-A: Deleting a job before the current job: In the Start\n");
        deleteJobBeforeCurrent_START.insertAtStart("10");
        deleteJobBeforeCurrent_START.insertAtStart("20");
        deleteJobBeforeCurrent_START.insertAtStart("30");
        deleteJobBeforeCurrent_START.insertAtStart("40");
        deleteJobBeforeCurrent_START.display();
        deleteJobBeforeCurrent_START.deleteCurrentJob();
        deleteJobBeforeCurrent_START.display();
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();

        // TEST 2-B: Deleting Job Before Current Job: MIDDLE
        System.out.println("TEST 2-B: Deleting a job before the current job: In the Middle\n");
        deleteJobBeforeCurrent_MIDDLE.insertAtStart("10");
        deleteJobBeforeCurrent_MIDDLE.insertAtStart("20");
        deleteJobBeforeCurrent_MIDDLE.insertAtStart("30");
        deleteJobBeforeCurrent_MIDDLE.insertAtStart("40");
        deleteJobBeforeCurrent_MIDDLE.insertAtStart("50");
        deleteJobBeforeCurrent_MIDDLE.insertAtPosition("100",2);
        deleteJobBeforeCurrent_MIDDLE.display();
        deleteJobBeforeCurrent_MIDDLE.deleteCurrentJob();
        deleteJobBeforeCurrent_MIDDLE.display();
        System.out.println("--------------------------------------------------");
        System.out.println();

        // TEST 2-C: Deleting Job Before Current Job: END
        System.out.println("TEST 2-C: Deleting a job before the current job: At the End\n");
        deleteJobBeforeCurrent_END.insertAtStart("10");
        deleteJobBeforeCurrent_END.insertAtStart("20");
        deleteJobBeforeCurrent_END.insertAtStart("30");
        deleteJobBeforeCurrent_END.insertAtStart("40");
        deleteJobBeforeCurrent_END.insertAtEnd("50");
        deleteJobBeforeCurrent_END.display();
        deleteJobBeforeCurrent_END.deleteCurrentJob();
        deleteJobBeforeCurrent_END.display();
        System.out.println("--------------------------------------------------");
        System.out.println();

        // TEST 3: TESTING IF LIST IS EMPTY:
        System.out.println("TEST 3: Are these lists empty?\n");

        // TEST 3-A: Testing if list is empty: after insertion
        System.out.println("TEST 3-A: List after insertion:");
        System.out.println(insertJobBeforeCurrent_START.isEmpty());
        System.out.println("--------------------------------------------------");
        System.out.println();

        // TEST 3-B: Testing if list is empty: after deletion
        System.out.println("TEST 3-B: List after deletion:");
        System.out.println(deleteJobBeforeCurrent_END.isEmpty());
        System.out.println("--------------------------------------------------");
        System.out.println();

        // TEST 3-C: Testing if list is empty: after instantiation of a list
        System.out.println("TEST 3-C: Truly empty list:");
        CircleDLL emptyList = new CircleDLL();
        System.out.println(emptyList.isEmpty());
        System.out.println("--------------------------------------------------");
        System.out.println();

        // TEST 4: TESTING PRINTING FROM CURRENT JOB IN THE LIST:

        // TEST 4-A: Testing a method to print the list from the current job:
        CircleDLL printFromCurrent = new CircleDLL();

        System.out.println("TEST 4-A: Testing a method to print the list from the current job:\n");
        printFromCurrent.insertAtStart("10");
        printFromCurrent.insertAtStart("20");
        printFromCurrent.insertAtStart("30");
        printFromCurrent.insertAtStart("40");
        printFromCurrent.insertAtStart("10000");
        printFromCurrent.displayFromCurrent();

    }
}

class Job {
    private int jobID; //job name
    private int runTime; //how long the job has run for
    private int allTime; //how much time the job needs total

    // references to next link
    private Job next;
    private Job prev;

    public Job(String newID, int newTime, Job n, Job p){
        jobID = Integer.parseInt(newID);
        runTime = 0; //hasn't run yet
        allTime = newTime;
        next = n;
        prev = p;
    }

    //methods to access values of private variables

    public Job getLinkNext() {
        return next;
    }

    public Job getLinkPrevious() {
        return prev;
    }

    public int getID() {
        return jobID;
    }

    public int getAllTime() {
        return allTime;
    }

    public int getRunTime() {
        return runTime;
    }

    //set those fields
    public void setLinkNext(Job newNext) {
        next = newNext;
    }

    public void setLinkPrevious(Job nexPrev) {
        prev = nexPrev;
    }

    //how much time is still needed
    public int timeRemaining() {
        return allTime-runTime;
    }

    //updating runtime with however long job just ran
    public void updateTime(int lastRunTime) {
        runTime += lastRunTime;
    }
}

class CircleDLL {

    // private members:
    protected Job start;
    protected Job end;
    private Job currentJob; // A private instance variable for the current job.
    public int size;

    // constructor:
    public CircleDLL(){
        start = null;
        end = null;
        currentJob = null;
        size = 0;
    }

    // getCurrent(): method that returns a reference to the current job
    public Job getCurrentJob(){
        return currentJob;
    }

    // // insertAtStart(): method to insert a job before the current job
    // // function to insert element @ beginning
    public void insertAtStart(String val){

        // create new job with data given
        Job jobPTR = new Job(val, 0,null, null);

        // if the list is empty ad the job to the beginning of the list so it points to itself:
        // otherwise add it to the end of the list
        if(start == null){

            // since this is a circular doubly linked list initialize the beginning
            jobPTR.setLinkNext(jobPTR);
            jobPTR.setLinkPrevious(jobPTR);
            start = jobPTR;
            end = start;

        } else {

            // list isn't empty add it to the end of the list
            jobPTR.setLinkPrevious(end);
            end.setLinkNext(jobPTR);
            start.setLinkPrevious(jobPTR);
            jobPTR.setLinkNext(start);
            start = jobPTR;

        }
        size++; // increment list

        // * update current
        currentJob = jobPTR;
    } // ends insertAtStart

    // insertBeforeCurrent(String val): function to insert job before current job
    public void insertBeforeCurrent(String val){

        // create new job:
        Job jobPTR = new Job(val, 0,null, null);

        // obtain current
        Job currentJobNode = currentJob;
        Job startJob = start;

        int position = 1;
        // boolean foundPosition = true;

        // if list is empty insert at the beginning because current doesnt exist
        if (size == 0){
            insertAtStart(val);
            // update current
        }

        // if list isnt empty find current and insert before the end
        for(int i = 0; i <= size; i++){

            if(startJob.getID() == currentJobNode.getID()){

                System.out.print(" - found a match.\n");
                insertAtPosition(val,position);
                break;
            } else {
                position++;
            }

            startJob = startJob.getLinkNext();
        }

        // outside the loop if the item
        if(position == getSize()){
            insertAtEnd(val);
            // update current
        }
        size++;

        // * update current
        currentJob = jobPTR;
    } // ends insertBeforeCurrent(int val)

    // insertAtEnd(): function to insertElement at the end:
    public void insertAtEnd(String val){

        // create job with given val:
        Job jobPTR = new Job(val, 0, null, null);

        // if the list is empty, add it to start + end
        // otherwise add it to the end + change necessary values
        if(start == null){
            jobPTR.setLinkNext(jobPTR);
            jobPTR.setLinkPrevious(jobPTR);
            start = jobPTR;
            end = start;
        } else {
            jobPTR.setLinkPrevious(end);
            end.setLinkNext(jobPTR);
            jobPTR.setLinkNext(start);
            start.setLinkPrevious(jobPTR);

            end = jobPTR;
        }
        size++;

        // * update current
        currentJob = jobPTR;
        // currentJob.setData(val);
    } // ends insertAtEnd

    //  insertAtPosition(String val, int position)
    //  function to insert element at position
    public void insertAtPosition(String val, int position){

        // create job:
        Job jobPTR = new Job(val,0, null, null);
        // * update current
        currentJob = jobPTR;
        // currentJob.setData(val);
        System.out.println(" - current data in change: " + currentJob.getID());

        // if its the first position insert at start
        if(position == 1 ){
            insertAtStart(val);
            return; // end
        }

        // iterate through list to find the item at the given position:
        Job pointer = start;

        for(int i = 2; i <= size; i++){

            // have found the verdict:
            if(i == position){
                Job temp = pointer.getLinkNext();
                pointer.setLinkNext(jobPTR);
                jobPTR.setLinkPrevious(pointer);
                jobPTR.setLinkNext(temp);
                temp.setLinkPrevious(jobPTR);
            }
            pointer = pointer.getLinkNext();
        }
        size++;

    } // ends insertAtPosition

    // *  function to delete current job:
    public void deleteCurrentJob(){

        // get the data of the value you'd like to delete:
        int currentJobPosition = currentJob.getID();
        int positionJob = 1; // to keep track of start of list

        if(currentJobPosition == start.getID()){
            deleteAtPos(1);
        } else if (currentJobPosition == end.getID()){
            deleteAtPos(size);
        } else {

            Job trackOfStart = start;

            for(int i = 0; i <= size; i++){

                if(currentJobPosition != trackOfStart.getID()) {
                    positionJob++;
                } else {
                    break;
                }

                trackOfStart = trackOfStart.getLinkNext();
            }

            deleteAtPos(positionJob);
        }
    } // ends deleteCurrentJob()

    // HELPER METHOD: deleteAtPosition(int position)
    // function to delete job at position:
    public void deleteAtPos(int position){

        // determine if pos is at the beginning
        if(position == 1){

            if(size == 1){
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getLinkNext(); // advance it to the next job in the list to get ride of it
            start.setLinkPrevious(end);
            end.setLinkNext(start);
            size--;

            // * update current
            currentJob = start;
            return; // end fn
        } // ends if

        // determine if pos is at the end
        if(position == size){
            end = end.getLinkPrevious(); // end is the previous item
            end.setLinkNext(start);
            start.setLinkPrevious(end);
            size--;

            // * update current
            currentJob = start;
        }

        Job pointer = start.getLinkNext();

        // loop through the list and determine where it is
        for(int i = 2; i <= size; i++){

            if(position == i){

                Job tempPrev = pointer.getLinkPrevious();
                Job tempNext = pointer.getLinkNext();

                tempPrev.setLinkNext(tempNext);
                tempNext.setLinkPrevious(tempPrev);
                size--;

            }
            pointer = pointer.getLinkNext();
        }
        // * update current
        currentJob = pointer.getLinkNext();
        // currentN.setData(pointer.getData());
    } // ends delete at position

    // advanceCurrentJob(): A method to advance the current job to the next job in the list
    public Job advanceCurrentJob(){
        currentJob = currentJob.getLinkNext();
        return currentJob;
    }

    // isEmpty(): A method to check whether the list is empty
    public boolean isEmpty(){
        if (start == null){
            System.out.println(" - EMPTY: This list is empty!");
            return true;
        } else {
            System.out.println(" - POPULATED: this list not is empty!");
            return false;
        }
    }

    // function to get size of list:
    public int getSize(){
        return size;
    }

    // * displayFromCurrent(): displays list starting from the current job:
    // function to display status of list:
    public void displayFromCurrent(){

        System.out.print("Circular Doubly Linked List:");
        Job pointer = start;

        if(size == 0){
            System.out.print("List is empty");
            return;
        }

        if(start.getLinkNext() == start){
            System.out.print(start.getID() + " <-> " + pointer.getID());
            return;
        }

        System.out.print(start.getID() + "<->");

        // grab the next link:
        pointer = currentJob.getLinkNext();

        while(pointer.getLinkNext() != currentJob){

            System.out.print(pointer.getID() + " <-> ");
            pointer = pointer.getLinkNext();

        }

        System.out.print(pointer.getID() + " <-> ");
        pointer = pointer.getLinkNext();
        System.out.print(pointer.getID() + "\n");

        // display current job data:
        System.out.println(" - current job id: " + currentJob.getID());
    }

    // display(): A method to print the list, starting with the current job.
    // function to display status of list:
    public void display(){

        System.out.print("Circular Doubly Linked List:");
        Job pointer = start;

        if(size == 0){
            System.out.print("List is empty");
            return;
        }

        if(start.getLinkNext() == start){
            System.out.print(start.getID() + " <-> " + pointer.getID());
            return;
        }

        System.out.print(start.getID() + "<->");

        // grab the next link:
        pointer = start.getLinkNext();

        while(pointer.getLinkNext() != start){

            System.out.print(pointer.getID() + " <-> ");
            pointer = pointer.getLinkNext();

        }

        System.out.print(pointer.getID() + " <-> ");
        pointer = pointer.getLinkNext();
        System.out.print(pointer.getID() + "\n");

        // display current job data:
        System.out.println("current job id: " + currentJob.getID());
    }

}
