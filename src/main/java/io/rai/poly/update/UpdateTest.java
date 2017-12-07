package io.rai.poly.update;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by rai on 2017/12/7.
 */
public class UpdateTest {

  private static ObjectMapper mapper = new ObjectMapper();

//  public static void main(String[] args) throws IOException {
//    List<UpdateAction> actions = Lists.newArrayList();
//
//    FAction fAction = new FAction();
//    fAction.setName("Test");
//
//    SAction sAction = new SAction();
//    sAction.setId("id");
//
////    Update<UpdateAction> update1 = new Update<>();
////    update1.setAction(fAction);
////
////    Update<UpdateAction> update2 = new Update<>();
////    update2.setAction(sAction);
//
//
//    actions.add(fAction);
//    actions.add(sAction);
//
//    UpdateRequest<UpdateAction> request = new UpdateRequest<>();
//    request.setVersion(1);
//    request.setActions(actions);
//
//    String jsonS = mapper.writeValueAsString(request);
//    System.out.println(jsonS);
//
////    String sJson = "[{\"name\":\"Test\",\"action\":\"FAction\"},{\"id\":\"id\",\"action\":\"SAction\"}]";
////
////    List<UpdateAction> updateActions = mapper.readValue(sJson, ArrayList.class);
////    System.out.println(updateActions);
////    System.out.println(updateActions.get(0).getClass());
////
////
////
////
////
////    String sJson1 = "{\"name\":\"Test\",\"action\":\"FAction\"}";
////    UpdateAction updateAction = mapper.readValue(sJson1, UpdateAction.class);
////    System.out.println(updateAction);
////    System.out.println(updateAction.getClass());
//    String nsJson = "{\"version\":1,\"actions\":[{\"name\":\"Test\",\"action\":\"FAction\"},{\"id\":\"id\",\"action\":\"SAction\"}]}";
//    UpdateRequest<UpdateAction> nRequest = mapper.readValue(nsJson, UpdateRequest.class);
//    System.out.println(nRequest);
//
//  }

}
