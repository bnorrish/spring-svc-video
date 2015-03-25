package ban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ban.client.AwsDynamoClient;
import ban.model.persistence.VideoD;
import ban.model.view.Video;

@Component
public class VideoSearchService {

  @Autowired
  private AwsDynamoClient dynamoClient;

  @Autowired
  Mapper mapper;

  /**
   * Determines if an existing video key already exists
   * @param key key for the video
   * @return true if the video exists, false otherwise
   */
  public boolean exists(String key) {

    return false;
  }

  /**
   * Retrieves the persistence Video from DynamoClient, maps to View model
   * @param id Video Identifier
   * @return The video in View model
   */
  public Video getVideo(String id){
    VideoD pVideo = dynamoClient.getVideo(id);
    return mapper.mapToViewModel(pVideo);
  }
}
