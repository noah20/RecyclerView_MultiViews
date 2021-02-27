package com.example.recyclerviewmultiviewsfacebookclon.dataprovider;

import com.example.recyclerviewmultiviewsfacebookclon.R;
import com.example.recyclerviewmultiviewsfacebookclon.model.POST_TYPE;
import com.example.recyclerviewmultiviewsfacebookclon.model.PRIVACY;
import com.example.recyclerviewmultiviewsfacebookclon.model.PostModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProviderRepo {
    private static final String LONG_TXT = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
    private static final String SHORT_TXT = "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...";

    public void getListOfData(OnDataAvail onDataAvail) {
        List<PostModel> models = new ArrayList<>();
        Random random = new Random();

        PostModel temp_1 = new PostModel();
        temp_1.setUserImageId(R.drawable.ic_profile);
        temp_1.setPrivacy(PRIVACY.PRIVACY_FRIENDS);
        temp_1.setUserName("Nooh Mohamed");
        temp_1.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_1.setType(POST_TYPE.Text);
       // temp_1.setImageId(R.drawable.test_iamge);
        temp_1.setDescription(SHORT_TXT);
        temp_1.setLikes(random.nextInt(10000));
        temp_1.setComments(random.nextInt(10000));
        models.add(temp_1);

        PostModel temp_2 = new PostModel();
        temp_2.setUserImageId(R.drawable.ic_profile);
        temp_2.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_2.setUserName("Ahmed Mohamed");
        temp_2.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_2.setType(POST_TYPE.Video);
        temp_2.setImageId(R.drawable.test_iamge);
        temp_2.setDescription(SHORT_TXT);
        temp_2.setLikes(random.nextInt(10000));
        temp_2.setComments(random.nextInt(10000));
        models.add(temp_2);



        PostModel temp_4 = new PostModel();
        temp_4.setUserImageId(R.drawable.ic_profile);
        temp_4.setPrivacy(PRIVACY.PRIVACY_FRIENDS);
        temp_4.setUserName("Nooh Mohamed");
        temp_4.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_4.setType(POST_TYPE.Text);
        temp_4.setDescription(SHORT_TXT);
        // temp_4.setImageId(R.drawable.test_iamge);
        temp_4.setLikes(random.nextInt(10000));
        temp_4.setComments(random.nextInt(10000));
        models.add(temp_4);

        PostModel temp_5 = new PostModel();
        temp_5.setUserImageId(R.drawable.ic_profile);
        temp_5.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_5.setUserName("Nooh Mohamed");
        temp_5.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_5.setType(POST_TYPE.Text);
        temp_5.setDescription(SHORT_TXT);
        // temp_1.setImageId(R.drawable.test_iamge);
        temp_5.setLikes(random.nextInt(10000));
        temp_5.setComments(random.nextInt(10000));
        models.add(temp_5);


        PostModel temp_3 = new PostModel();
        temp_3.setUserImageId(R.drawable.ic_profile);
        temp_3.setPrivacy(PRIVACY.PRIVACY_FRIENDS);
        temp_3.setUserName("Michel Jim");
        temp_3.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_3.setType(POST_TYPE.Image);
        temp_3.setImageId(R.drawable.test_iamge);
        temp_3.setDescription(SHORT_TXT);
        temp_3.setLikes(random.nextInt(10000));
        temp_3.setComments(random.nextInt(10000));
        models.add(temp_3);

        PostModel temp_8 = new PostModel();
        temp_8.setUserImageId(R.drawable.ic_profile);
        temp_8.setPrivacy(PRIVACY.PRIVACY_FRIENDS);
        temp_8.setUserName("Michel Jim");
        temp_8.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_8.setType(POST_TYPE.Image);
        temp_8.setImageId(R.drawable.test_iamge);
        temp_8.setDescription(SHORT_TXT);
        temp_8.setLikes(random.nextInt(10000));
        temp_8.setComments(random.nextInt(10000));
        models.add(temp_8);
        PostModel temp_6 = new PostModel();
        temp_6.setUserImageId(R.drawable.ic_profile);
        temp_6.setPrivacy(PRIVACY.PRIVACY_FRIENDS);
        temp_6.setUserName("Nooh Mohamed");
        temp_6.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_6.setType(POST_TYPE.Text);
        // temp_1.setImageId(R.drawable.test_iamge);
        temp_6.setDescription(SHORT_TXT);
        temp_6.setLikes(random.nextInt(10000));
        temp_6.setComments(random.nextInt(10000));
        models.add(temp_6);

        PostModel temp_7 = new PostModel();
        temp_7.setUserImageId(R.drawable.ic_profile);
        temp_7.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_7.setUserName("Ahmed Mohamed");
        temp_7.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_7.setType(POST_TYPE.Video);
        temp_7.setImageId(R.drawable.test_iamge);
        temp_7.setDescription(SHORT_TXT);
        temp_7.setLikes(random.nextInt(10000));
        temp_7.setComments(random.nextInt(10000));
        models.add(temp_7);




        PostModel temp_9 = new PostModel();
        temp_9.setUserImageId(R.drawable.ic_profile);
        temp_9.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_9.setUserName("Nooh Mohamed");
        temp_9.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_9.setType(POST_TYPE.Text);
        // temp_1.setImageId(R.drawable.test_iamge);
        temp_9.setDescription(SHORT_TXT);
        temp_9.setLikes(random.nextInt(10000));
        temp_9.setComments(random.nextInt(10000));
        models.add(temp_9);

        PostModel temp_12 = new PostModel();
        temp_12.setUserImageId(R.drawable.ic_profile);
        temp_12.setPrivacy(PRIVACY.PRIVACY_FRIENDS);
        temp_12.setUserName("Nooh Mohamed");
        temp_12.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_12.setType(POST_TYPE.Text);
        // temp_1.setImageId(R.drawable.test_iamge);
        temp_12.setDescription(SHORT_TXT);
        temp_12.setLikes(random.nextInt(10000));
        temp_12.setComments(random.nextInt(10000));
        models.add(temp_12);

        PostModel temp_10 = new PostModel();
        temp_10.setUserImageId(R.drawable.ic_profile);
        temp_10.setPrivacy(PRIVACY.PRIVACY_FRIENDS);
        temp_10.setUserName("Ahmed Mohamed");
        temp_10.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_10.setType(POST_TYPE.Video);
        temp_10.setImageId(R.drawable.test_iamge);
        temp_10.setDescription(SHORT_TXT);
        temp_10.setLikes(random.nextInt(10000));
        temp_10.setComments(random.nextInt(10000));
        models.add(temp_10);

        PostModel temp_11 = new PostModel();
        temp_11.setUserImageId(R.drawable.ic_profile);
        temp_11.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_11.setUserName("Michel Jim");
        temp_11.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_11.setType(POST_TYPE.Image);
        temp_11.setImageId(R.drawable.test_iamge);
        temp_11.setDescription(SHORT_TXT);
        temp_11.setLikes(random.nextInt(10000));
        temp_11.setComments(random.nextInt(10000));
        models.add(temp_11);




        PostModel temp_13 = new PostModel();
        temp_13.setUserImageId(R.drawable.ic_profile);
        temp_13.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_13.setUserName("Ahmed Mohamed");
        temp_13.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_13.setType(POST_TYPE.Video);
        temp_13.setImageId(R.drawable.test_iamge);
        temp_13.setDescription(SHORT_TXT);
        temp_13.setLikes(random.nextInt(10000));
        temp_13.setComments(random.nextInt(10000));
        models.add(temp_13);

        PostModel temp_16 = new PostModel();
        temp_16.setUserImageId(R.drawable.ic_profile);
        temp_16.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_16.setUserName("Ahmed Mohamed");
        temp_16.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_16.setType(POST_TYPE.Video);
        temp_16.setImageId(R.drawable.test_iamge);
        temp_16.setDescription(SHORT_TXT);
        temp_16.setLikes(random.nextInt(10000));
        temp_16.setComments(random.nextInt(10000));
        models.add(temp_16);
        PostModel temp_14 = new PostModel();
        temp_14.setUserImageId(R.drawable.ic_profile);
        temp_14.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_14.setUserName("Michel Jim");
        temp_14.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_14.setType(POST_TYPE.Image);
        temp_14.setImageId(R.drawable.test_iamge);
        temp_14.setDescription(SHORT_TXT);
        temp_14.setLikes(random.nextInt(10000));
        temp_14.setComments(random.nextInt(10000));
        models.add(temp_14);



        PostModel temp_15 = new PostModel();
        temp_15.setUserImageId(R.drawable.ic_profile);
        temp_15.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_15.setUserName("Nooh Mohamed");
        temp_15.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_15.setType(POST_TYPE.Text);
        // temp_1.setImageId(R.drawable.test_iamge);
        temp_15.setDescription(SHORT_TXT);
        temp_15.setLikes(random.nextInt(10000));
        temp_15.setComments(random.nextInt(10000));
        models.add(temp_15);



        PostModel temp_17 = new PostModel();
        temp_17.setUserImageId(R.drawable.ic_profile);
        temp_17.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_17.setUserName("Michel Jim");
        temp_17.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_17.setType(POST_TYPE.Image);
        temp_17.setImageId(R.drawable.test_iamge);
        temp_17.setDescription(SHORT_TXT);
        temp_17.setLikes(random.nextInt(10000));
        temp_17.setComments(random.nextInt(10000));
        models.add(temp_17);

        PostModel temp_20 = new PostModel();
        temp_20.setUserImageId(R.drawable.ic_profile);
        temp_20.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_20.setUserName("Michel Jim");
        temp_20.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_20.setType(POST_TYPE.Image);
        temp_20.setImageId(R.drawable.test_iamge);
        temp_20.setDescription(SHORT_TXT);
        temp_20.setLikes(random.nextInt(10000));
        temp_20.setComments(random.nextInt(10000));
        models.add(temp_20);
        PostModel temp_18 = new PostModel();
        temp_18.setUserImageId(R.drawable.ic_profile);
        temp_18.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_18.setUserName("Nooh Mohamed");
        temp_18.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_18.setType(POST_TYPE.Text);
        // temp_1.setImageId(R.drawable.test_iamge);
        temp_18.setDescription(SHORT_TXT);
        temp_18.setLikes(random.nextInt(10000));
        temp_18.setComments(random.nextInt(10000));
        models.add(temp_18);

        PostModel temp_19 = new PostModel();
        temp_19.setUserImageId(R.drawable.ic_profile);
        temp_19.setPrivacy(PRIVACY.PRIVACY_ALL);
        temp_19.setUserName("Ahmed Mohamed");
        temp_19.setTime(System.currentTimeMillis()-(random.nextInt(10000)*4));
        temp_19.setType(POST_TYPE.Video);
        temp_19.setImageId(R.drawable.test_iamge);
        temp_19.setDescription(SHORT_TXT);
        temp_19.setLikes(random.nextInt(10000));
        temp_19.setComments(random.nextInt(10000));
        models.add(temp_19);





        onDataAvail.onDataAvail(models);
    }
}
