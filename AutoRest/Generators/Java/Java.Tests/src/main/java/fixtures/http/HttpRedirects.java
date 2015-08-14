// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import java.util.List;
import retrofit.http.HEAD;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.DELETE;

public interface HttpRedirects {
    interface HttpRedirectsService {
        @HEAD("/http/redirect/300")
        Response head300() throws ServiceException;

        @HEAD("/http/redirect/300")
        void head300Async(ServiceResponseCallback cb);

        @GET("/http/redirect/300")
        Response get300() throws ServiceException;

        @GET("/http/redirect/300")
        void get300Async(ServiceResponseCallback cb);

        @HEAD("/http/redirect/301")
        Response head301() throws ServiceException;

        @HEAD("/http/redirect/301")
        void head301Async(ServiceResponseCallback cb);

        @GET("/http/redirect/301")
        Response get301() throws ServiceException;

        @GET("/http/redirect/301")
        void get301Async(ServiceResponseCallback cb);

        @PUT("/http/redirect/301")
        Response put301(@Body boolean booleanValue) throws ServiceException;

        @PUT("/http/redirect/301")
        void put301Async(@Body boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/redirect/302")
        Response head302() throws ServiceException;

        @HEAD("/http/redirect/302")
        void head302Async(ServiceResponseCallback cb);

        @GET("/http/redirect/302")
        Response get302() throws ServiceException;

        @GET("/http/redirect/302")
        void get302Async(ServiceResponseCallback cb);

        @PATCH("/http/redirect/302")
        Response patch302(@Body boolean booleanValue) throws ServiceException;

        @PATCH("/http/redirect/302")
        void patch302Async(@Body boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/redirect/303")
        Response post303(@Body boolean booleanValue) throws ServiceException;

        @POST("/http/redirect/303")
        void post303Async(@Body boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/redirect/307")
        Response head307() throws ServiceException;

        @HEAD("/http/redirect/307")
        void head307Async(ServiceResponseCallback cb);

        @GET("/http/redirect/307")
        Response get307() throws ServiceException;

        @GET("/http/redirect/307")
        void get307Async(ServiceResponseCallback cb);

        @PUT("/http/redirect/307")
        Response put307(@Body boolean booleanValue) throws ServiceException;

        @PUT("/http/redirect/307")
        void put307Async(@Body boolean booleanValue, ServiceResponseCallback cb);

        @PATCH("/http/redirect/307")
        Response patch307(@Body boolean booleanValue) throws ServiceException;

        @PATCH("/http/redirect/307")
        void patch307Async(@Body boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/redirect/307")
        Response post307(@Body boolean booleanValue) throws ServiceException;

        @POST("/http/redirect/307")
        void post307Async(@Body boolean booleanValue, ServiceResponseCallback cb);

        @DELETE("/http/redirect/307")
        Response delete307(@Body boolean booleanValue) throws ServiceException;

        @DELETE("/http/redirect/307")
        void delete307Async(@Body boolean booleanValue, ServiceResponseCallback cb);

    }
    void head300() throws ServiceException;

    void head300Async(final ServiceCallback<Void> serviceCallback);

    List<String> get300() throws ServiceException;

    void get300Async(final ServiceCallback<List<String>> serviceCallback);

    void head301() throws ServiceException;

    void head301Async(final ServiceCallback<Void> serviceCallback);

    void get301() throws ServiceException;

    void get301Async(final ServiceCallback<Void> serviceCallback);

    void put301(boolean booleanValue) throws ServiceException;

    void put301Async(boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    void head302() throws ServiceException;

    void head302Async(final ServiceCallback<Void> serviceCallback);

    void get302() throws ServiceException;

    void get302Async(final ServiceCallback<Void> serviceCallback);

    void patch302(boolean booleanValue) throws ServiceException;

    void patch302Async(boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    void post303(boolean booleanValue) throws ServiceException;

    void post303Async(boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    void head307() throws ServiceException;

    void head307Async(final ServiceCallback<Void> serviceCallback);

    void get307() throws ServiceException;

    void get307Async(final ServiceCallback<Void> serviceCallback);

    void put307(boolean booleanValue) throws ServiceException;

    void put307Async(boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    void patch307(boolean booleanValue) throws ServiceException;

    void patch307Async(boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    void post307(boolean booleanValue) throws ServiceException;

    void post307Async(boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    void delete307(boolean booleanValue) throws ServiceException;

    void delete307Async(boolean booleanValue, final ServiceCallback<Void> serviceCallback);

}
