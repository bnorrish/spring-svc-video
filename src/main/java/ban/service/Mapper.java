package ban.service;

import org.springframework.stereotype.Component;

import ban.model.view.Video;

/**
 * This is TEMPORARY till I figure out how I want to map between domain models
 */
@Component
public class Mapper {

  public Video mapToViewModel(ban.model.persistence.Video pVideo) {

    if(pVideo == null) {
      return null;
    }

    Video video = new Video();
    video.setId(pVideo.getId());
    return video;
  }
}
