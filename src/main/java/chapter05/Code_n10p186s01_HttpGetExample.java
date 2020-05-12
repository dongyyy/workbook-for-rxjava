package chapter05;

import common.Log;
import okhttp3.*;

import java.io.IOException;

public class Code_n10p186s01_HttpGetExample {

    private static final OkHttpClient client = new OkHttpClient();

    private static final String URL_README = "https://raw.githubusercontent.com/yudong80/reactivejava/master/README.md";

    public static void main(String[] args) {
        Request request = new Request.Builder()
                .url(URL_README)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.i(response.body().string());
            }
        });
    }
}
