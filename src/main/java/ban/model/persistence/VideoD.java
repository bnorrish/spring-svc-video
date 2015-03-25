package ban.model.persistence;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Video class as persisted in AWS Dynamo
 */

@DynamoDBTable(tableName="Video")
public class VideoD {

  @DynamoDBHashKey(attributeName="VideoId")
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


}
