// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodystring;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.bodystring.models.Error;

public class StringOperationsImpl implements StringOperations {
    private StringService service;

    public StringOperationsImpl(RestAdapter restAdapter) {
        service = restAdapter.create(StringService.class);
    }

    public String getNull() throws ServiceException {
        try {
            ServiceResponse<String> response = getNullDelegate(service.getNull(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<String> response = getNullDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void getNullAsync(final ServiceCallback<String> serviceCallback) {
        service.getNullAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getNullDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<String> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<String>()
                .register(200, new TypeToken<String>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public void putNull(String stringBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putNullDelegate(service.putNull(stringBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putNullDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    public void putNullAsync(String stringBody, final ServiceCallback<Void> serviceCallback) {
        service.putNullAsync(stringBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putNullDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public String getEmpty() throws ServiceException {
        try {
            ServiceResponse<String> response = getEmptyDelegate(service.getEmpty(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<String> response = getEmptyDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void getEmptyAsync(final ServiceCallback<String> serviceCallback) {
        service.getEmptyAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getEmptyDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<String> getEmptyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<String>()
                .register(200, new TypeToken<String>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public void putEmpty(String stringBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putEmptyDelegate(service.putEmpty(stringBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putEmptyDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    public void putEmptyAsync(String stringBody, final ServiceCallback<Void> serviceCallback) {
        service.putEmptyAsync(stringBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putEmptyDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putEmptyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public String getMbcs() throws ServiceException {
        try {
            ServiceResponse<String> response = getMbcsDelegate(service.getMbcs(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<String> response = getMbcsDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void getMbcsAsync(final ServiceCallback<String> serviceCallback) {
        service.getMbcsAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getMbcsDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<String> getMbcsDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<String>()
                .register(200, new TypeToken<String>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public void putMbcs(String stringBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putMbcsDelegate(service.putMbcs(stringBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putMbcsDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    public void putMbcsAsync(String stringBody, final ServiceCallback<Void> serviceCallback) {
        service.putMbcsAsync(stringBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMbcsDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMbcsDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public String getWhitespace() throws ServiceException {
        try {
            ServiceResponse<String> response = getWhitespaceDelegate(service.getWhitespace(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<String> response = getWhitespaceDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void getWhitespaceAsync(final ServiceCallback<String> serviceCallback) {
        service.getWhitespaceAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getWhitespaceDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<String> getWhitespaceDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<String>()
                .register(200, new TypeToken<String>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public void putWhitespace(String stringBody) throws ServiceException {
        try {
            ServiceResponse<Void> response = putWhitespaceDelegate(service.putWhitespace(stringBody), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putWhitespaceDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    public void putWhitespaceAsync(String stringBody, final ServiceCallback<Void> serviceCallback) {
        service.putWhitespaceAsync(stringBody, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putWhitespaceDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putWhitespaceDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public String getNotProvided() throws ServiceException {
        try {
            ServiceResponse<String> response = getNotProvidedDelegate(service.getNotProvided(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<String> response = getNotProvidedDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void getNotProvidedAsync(final ServiceCallback<String> serviceCallback) {
        service.getNotProvidedAsync(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getNotProvidedDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<String> getNotProvidedDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<String>()
                .register(200, new TypeToken<String>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
