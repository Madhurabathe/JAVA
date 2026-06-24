package train;
public class Coach {
        String coachName;
        Coach next;

        Coach(String coachName) {
            this.coachName = coachName;
            this.next = null;
        }

        public String getCoachName() {
            return coachName;
        }
    }
