package ban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ban.client.AwsDynamoClient;
import ban.model.persistence.VideoD;
import ban.model.view.Video;

/**
 * Created by bnorrish on 6/10/15.
 */

@Component
public class VideoAddService {

  @Autowired
  private AwsDynamoClient dynamoClient;

  @Autowired
  private Mapper mapper;

  public Video addVideo(Video video) {

    // Validate?

    VideoD pVideo = mapper.mapToPersistanceModel(video);
    pVideo = dynamoClient.createVideo(pVideo);
    return mapper.mapToViewModel(pVideo);
  }
}
