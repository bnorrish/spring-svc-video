package ban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ban.client.AwsDynamoClient;
import ban.model.Video;

@Component
public class VideoSearchService {

  @Autowired
  private AwsDynamoClient dynamoClient;

  /**
   * Determines if an existing video key already exists
   * @param key key for the video
   * @return true if the video exists, false otherwise
   */
  public boolean exists(String key) {

    return false;
  }

  public Video getVideo(String id){
    Video video = new Video();
    video.setId(id);
    return video;
  }
}
