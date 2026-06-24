package train;

class TrainLinkedList {
        Coach head;

        public void addAtStart(String coachName) {
            Coach newCoach = new Coach(coachName);
            //here the head is the refrencce to the address of the current starting node 
            newCoach.next = head;
            head = newCoach;
            System.out.println("Coach Added Successfully!");
        }

        // Add at end
        public void addAtEnd(String coachName) {
            Coach newCoach = new Coach(coachName);
            if (head == null) {
                head = newCoach;
                return;
            }
            Coach temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newCoach;
            System.out.println("Coach Added Successfully!");
        }

        // Display
        public void display() {
            if (head == null) {
                System.out.println("No Coaches Available.");
                return;
            }

            Coach temp = head;

            System.out.println("Train Coaches:");

            while (temp != null) {
                System.out.print(temp.coachName + " -> ");
                temp = temp.next;
            }

            System.out.println("NULL");
        }

        // Count coaches
        public void countCoaches() {
            int count = 0;

            Coach temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            System.out.println("Total Coaches: " + count);
        }

        // Search coach
        public void searchCoach(String coachName) {
            Coach temp = head;

            while (temp != null) {
                if (temp.coachName.equalsIgnoreCase(coachName)) {
                    System.out.println("Coach Found!");
                    return;
                }
                temp = temp.next;
            }

            System.out.println("Coach Not Found!");
        }

        // Delete coach
        public void deleteCoach(String coachName) {

            if (head == null) {
                System.out.println("No Coaches Available.");
                return;
            }

            if (head.coachName.equalsIgnoreCase(coachName)) {
                head = head.next;
                System.out.println("Coach Removed Successfully!");
                return;
            }

            Coach temp = head;

            while (temp.next != null &&
                    !temp.next.coachName.equalsIgnoreCase(coachName)) {
                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("Coach Not Found!");
            } else {
                temp.next = temp.next.next;
                System.out.println("Coach Removed Successfully!");
            }
        }

        // Insert after coach
        public void insertAfter(String existingCoach,
                                String newCoachName) {

            Coach temp=head;

            while ( temp != null) {

                if (temp.coachName.equalsIgnoreCase(existingCoach)) {

                    Coach newCoach = new Coach(newCoachName);

                    newCoach.next = temp.next;
                    temp.next = newCoach;

                    System.out.println("Coach Inserted Successfully!");
                    return;
                }

                temp = temp.next;
            }

            System.out.println("Coach Not Found!");
        }
    }

    