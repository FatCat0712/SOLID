import notifier.EmailNotifier;
import notifier.FacebookNotifier;
import notifier.PhoneNotifier;
import notifier.YoutubeNotifier;
import subject.VideoData;

public class Main {
    public static void main(String[] args) {
        VideoData videoData = new VideoData();
        videoData.setTitle("Observer Pattern in Java");
        videoData.setDescription("This video explains the Observer Pattern in Java with a practical example.");
        videoData.setFileName("observer_pattern_java.mp4");

        var emailNotifier = new EmailNotifier(videoData);
        var phoneNotifier = new PhoneNotifier(videoData);
        var youtubeNotifier = new YoutubeNotifier(videoData);

        videoData.setTitle("Observer Pattern in Java - Updated");
        videoData.setDescription("This video explains the Observer Pattern in Java with a practical example. Updated version.");
        videoData.setFileName("observer_pattern_java_updated.mp4");

        videoData.detachObserver(emailNotifier);
        System.out.println("--------------------------------------");
        videoData.setDescription("Ongdev's video");

        System.out.println("--------------------------------------");
        new FacebookNotifier(videoData);
        videoData.setDescription("Ongdev's video - Updated");
        System.out.println("--------------------------------------");


    }
}

