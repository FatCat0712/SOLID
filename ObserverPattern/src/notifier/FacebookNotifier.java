package notifier;

import base.Observer;
import base.Subject;
import subject.VideoData;

public class FacebookNotifier extends Observer {
    public FacebookNotifier(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    @Override
    public void notify(Object arg) {
        if(subject instanceof VideoData videoData) {
            String message = String.format("Notify all subscribers via FACEBOOK with new data: \n\tName: %s\n\tDescription: %s\n\tFileName: %s",
                    videoData.getTitle(), videoData.getDescription(), videoData.getFileName());
            System.out.println(message);
        }
    }
}
