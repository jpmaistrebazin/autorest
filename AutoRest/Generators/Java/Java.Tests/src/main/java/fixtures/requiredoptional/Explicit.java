// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.requiredoptional;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.requiredoptional.models.IntWrapper;
import fixtures.requiredoptional.models.IntOptionalWrapper;
import fixtures.requiredoptional.models.StringWrapper;
import fixtures.requiredoptional.models.StringOptionalWrapper;
import fixtures.requiredoptional.models.Product;
import fixtures.requiredoptional.models.ClassWrapper;
import fixtures.requiredoptional.models.ClassOptionalWrapper;
import java.util.List;
import fixtures.requiredoptional.models.ArrayWrapper;
import fixtures.requiredoptional.models.ArrayOptionalWrapper;
import fixtures.requiredoptional.models.Error;
import retrofit.http.POST;
import retrofit.http.Body;
import retrofit.http.Header;

public interface Explicit {
    interface ExplicitService {
        @POST("/reqopt/requied/integer/parameter")
        Response postRequiredIntegerParameter(@Body int bodyParameter) throws ServiceException;

        @POST("/reqopt/requied/integer/parameter")
        void postRequiredIntegerParameterAsync(@Body int bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/integer/parameter")
        Response postOptionalIntegerParameter(@Body int bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/integer/parameter")
        void postOptionalIntegerParameterAsync(@Body int bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/integer/property")
        Response postRequiredIntegerProperty(@Body IntWrapper bodyParameter) throws ServiceException;

        @POST("/reqopt/requied/integer/property")
        void postRequiredIntegerPropertyAsync(@Body IntWrapper bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/integer/property")
        Response postOptionalIntegerProperty(@Body IntOptionalWrapper bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/integer/property")
        void postOptionalIntegerPropertyAsync(@Body IntOptionalWrapper bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/integer/header")
        Response postRequiredIntegerHeader(@Header("headerParameter") int headerParameter) throws ServiceException;

        @POST("/reqopt/requied/integer/header")
        void postRequiredIntegerHeaderAsync(@Header("headerParameter") int headerParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/integer/header")
        Response postOptionalIntegerHeader(@Header("headerParameter") int headerParameter) throws ServiceException;

        @POST("/reqopt/optional/integer/header")
        void postOptionalIntegerHeaderAsync(@Header("headerParameter") int headerParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/string/parameter")
        Response postRequiredStringParameter(@Body String bodyParameter) throws ServiceException;

        @POST("/reqopt/requied/string/parameter")
        void postRequiredStringParameterAsync(@Body String bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/string/parameter")
        Response postOptionalStringParameter(@Body String bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/string/parameter")
        void postOptionalStringParameterAsync(@Body String bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/string/property")
        Response postRequiredStringProperty(@Body StringWrapper bodyParameter) throws ServiceException;

        @POST("/reqopt/requied/string/property")
        void postRequiredStringPropertyAsync(@Body StringWrapper bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/string/property")
        Response postOptionalStringProperty(@Body StringOptionalWrapper bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/string/property")
        void postOptionalStringPropertyAsync(@Body StringOptionalWrapper bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/string/header")
        Response postRequiredStringHeader(@Header("headerParameter") String headerParameter) throws ServiceException;

        @POST("/reqopt/requied/string/header")
        void postRequiredStringHeaderAsync(@Header("headerParameter") String headerParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/string/header")
        Response postOptionalStringHeader(@Header("bodyParameter") String bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/string/header")
        void postOptionalStringHeaderAsync(@Header("bodyParameter") String bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/class/parameter")
        Response postRequiredClassParameter(@Body Product bodyParameter) throws ServiceException;

        @POST("/reqopt/requied/class/parameter")
        void postRequiredClassParameterAsync(@Body Product bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/class/parameter")
        Response postOptionalClassParameter(@Body Product bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/class/parameter")
        void postOptionalClassParameterAsync(@Body Product bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/class/property")
        Response postRequiredClassProperty(@Body ClassWrapper bodyParameter) throws ServiceException;

        @POST("/reqopt/requied/class/property")
        void postRequiredClassPropertyAsync(@Body ClassWrapper bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/class/property")
        Response postOptionalClassProperty(@Body ClassOptionalWrapper bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/class/property")
        void postOptionalClassPropertyAsync(@Body ClassOptionalWrapper bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/array/parameter")
        Response postRequiredArrayParameter(@Body List<String> bodyParameter) throws ServiceException;

        @POST("/reqopt/requied/array/parameter")
        void postRequiredArrayParameterAsync(@Body List<String> bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/array/parameter")
        Response postOptionalArrayParameter(@Body List<String> bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/array/parameter")
        void postOptionalArrayParameterAsync(@Body List<String> bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/array/property")
        Response postRequiredArrayProperty(@Body ArrayWrapper bodyParameter) throws ServiceException;

        @POST("/reqopt/requied/array/property")
        void postRequiredArrayPropertyAsync(@Body ArrayWrapper bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/array/property")
        Response postOptionalArrayProperty(@Body ArrayOptionalWrapper bodyParameter) throws ServiceException;

        @POST("/reqopt/optional/array/property")
        void postOptionalArrayPropertyAsync(@Body ArrayOptionalWrapper bodyParameter, ServiceResponseCallback cb);

        @POST("/reqopt/requied/array/header")
        Response postRequiredArrayHeader(@Header("headerParameter") List<String> headerParameter) throws ServiceException;

        @POST("/reqopt/requied/array/header")
        void postRequiredArrayHeaderAsync(@Header("headerParameter") List<String> headerParameter, ServiceResponseCallback cb);

        @POST("/reqopt/optional/array/header")
        Response postOptionalArrayHeader(@Header("headerParameter") List<String> headerParameter) throws ServiceException;

        @POST("/reqopt/optional/array/header")
        void postOptionalArrayHeaderAsync(@Header("headerParameter") List<String> headerParameter, ServiceResponseCallback cb);

    }
    Error postRequiredIntegerParameter(int bodyParameter) throws ServiceException;

    void postRequiredIntegerParameterAsync(int bodyParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalIntegerParameter(int bodyParameter) throws ServiceException;

    void postOptionalIntegerParameterAsync(int bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredIntegerProperty(IntWrapper bodyParameter) throws ServiceException;

    void postRequiredIntegerPropertyAsync(IntWrapper bodyParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalIntegerProperty(IntOptionalWrapper bodyParameter) throws ServiceException;

    void postOptionalIntegerPropertyAsync(IntOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredIntegerHeader(int headerParameter) throws ServiceException;

    void postRequiredIntegerHeaderAsync(int headerParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalIntegerHeader(int headerParameter) throws ServiceException;

    void postOptionalIntegerHeaderAsync(int headerParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredStringParameter(String bodyParameter) throws ServiceException;

    void postRequiredStringParameterAsync(String bodyParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalStringParameter(String bodyParameter) throws ServiceException;

    void postOptionalStringParameterAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredStringProperty(StringWrapper bodyParameter) throws ServiceException;

    void postRequiredStringPropertyAsync(StringWrapper bodyParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalStringProperty(StringOptionalWrapper bodyParameter) throws ServiceException;

    void postOptionalStringPropertyAsync(StringOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredStringHeader(String headerParameter) throws ServiceException;

    void postRequiredStringHeaderAsync(String headerParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalStringHeader(String bodyParameter) throws ServiceException;

    void postOptionalStringHeaderAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredClassParameter(Product bodyParameter) throws ServiceException;

    void postRequiredClassParameterAsync(Product bodyParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalClassParameter(Product bodyParameter) throws ServiceException;

    void postOptionalClassParameterAsync(Product bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredClassProperty(ClassWrapper bodyParameter) throws ServiceException;

    void postRequiredClassPropertyAsync(ClassWrapper bodyParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalClassProperty(ClassOptionalWrapper bodyParameter) throws ServiceException;

    void postOptionalClassPropertyAsync(ClassOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredArrayParameter(List<String> bodyParameter) throws ServiceException;

    void postRequiredArrayParameterAsync(List<String> bodyParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalArrayParameter(List<String> bodyParameter) throws ServiceException;

    void postOptionalArrayParameterAsync(List<String> bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredArrayProperty(ArrayWrapper bodyParameter) throws ServiceException;

    void postRequiredArrayPropertyAsync(ArrayWrapper bodyParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalArrayProperty(ArrayOptionalWrapper bodyParameter) throws ServiceException;

    void postOptionalArrayPropertyAsync(ArrayOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback);

    Error postRequiredArrayHeader(List<String> headerParameter) throws ServiceException;

    void postRequiredArrayHeaderAsync(List<String> headerParameter, final ServiceCallback<Error> serviceCallback);

    void postOptionalArrayHeader(List<String> headerParameter) throws ServiceException;

    void postOptionalArrayHeaderAsync(List<String> headerParameter, final ServiceCallback<Void> serviceCallback);

}
