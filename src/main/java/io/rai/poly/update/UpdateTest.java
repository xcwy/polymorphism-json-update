package io.rai.poly.update;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by rai on 2017/12/7.
 */
public class UpdateTest {

  private static ObjectMapper mapper = new ObjectMapper();

//  public static void main(String[] args) throws IOException {
//    List<UserAction> actions = Lists.newArrayList();
//
//    UserSetNameAction fAction = new UserSetNameAction();
//    fAction.setName("Test");
//
//    UserSetIdAction sAction = new UserSetIdAction();
//    sAction.setId("id");
//
////    Update<UserAction> update1 = new Update<>();
////    update1.setAction(fAction);
////
////    Update<UserAction> update2 = new Update<>();
////    update2.setAction(sAction);
//
//
//    actions.add(fAction);
//    actions.add(sAction);
//
//    UpdateRequest<UserAction> request = new UpdateRequest<>();
//    request.setVersion(1);
//    request.setActions(actions);
//
//    String jsonS = mapper.writeValueAsString(request);
//    System.out.println(jsonS);
//
////    String sJson = "[{\"name\":\"Test\",\"action\":\"UserSetNameAction\"},{\"id\":\"id\",\"action\":\"UserSetIdAction\"}]";
////
////    List<UserAction> updateActions = mapper.readValue(sJson, ArrayList.class);
////    System.out.println(updateActions);
////    System.out.println(updateActions.get(0).getClass());
////
////
////
////
////
////    String sJson1 = "{\"name\":\"Test\",\"action\":\"UserSetNameAction\"}";
////    UserAction updateAction = mapper.readValue(sJson1, UserAction.class);
////    System.out.println(updateAction);
////    System.out.println(updateAction.getClass());
//    String nsJson = "{\"version\":1,\"actions\":[{\"name\":\"Test\",\"action\":\"UserSetNameAction\"},{\"id\":\"id\",\"action\":\"UserSetIdAction\"}]}";
//    UpdateRequest<UserAction> nRequest = mapper.readValue(nsJson, UpdateRequest.class);
//    System.out.println(nRequest);
//
//  }

}
