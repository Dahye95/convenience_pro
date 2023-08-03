package Network;

import model.saleProductList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitService {
    @GET("gs25/")
    Call<saleProductList> getGs25(

    );
}
