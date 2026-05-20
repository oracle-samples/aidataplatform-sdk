# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class HttpToolConfiguration(object):
    """
    Configuration for HTTP Tool requests
    """

    #: A constant which can be used with the method property of a HttpToolConfiguration.
    #: This constant has a value of "GET"
    METHOD_GET = "GET"

    #: A constant which can be used with the method property of a HttpToolConfiguration.
    #: This constant has a value of "POST"
    METHOD_POST = "POST"

    #: A constant which can be used with the method property of a HttpToolConfiguration.
    #: This constant has a value of "PUT"
    METHOD_PUT = "PUT"

    #: A constant which can be used with the method property of a HttpToolConfiguration.
    #: This constant has a value of "DELETE"
    METHOD_DELETE = "DELETE"

    #: A constant which can be used with the method property of a HttpToolConfiguration.
    #: This constant has a value of "PATCH"
    METHOD_PATCH = "PATCH"

    def __init__(self, **kwargs):
        """
        Initializes a new HttpToolConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param method:
            The value to assign to the method property of this HttpToolConfiguration.
            Allowed values for this property are: "GET", "POST", "PUT", "DELETE", "PATCH"
        :type method: str

        :param url:
            The value to assign to the url property of this HttpToolConfiguration.
        :type url: str

        :param headers:
            The value to assign to the headers property of this HttpToolConfiguration.
        :type headers: dict(str, str)

        :param params:
            The value to assign to the params property of this HttpToolConfiguration.
        :type params: dict(str, str)

        :param body:
            The value to assign to the body property of this HttpToolConfiguration.
        :type body: dict(str, object)

        :param timeout:
            The value to assign to the timeout property of this HttpToolConfiguration.
        :type timeout: int

        :param auth:
            The value to assign to the auth property of this HttpToolConfiguration.
        :type auth: oci.aidataplatform_dp.models.Auth

        :param response_optimization:
            The value to assign to the response_optimization property of this HttpToolConfiguration.
        :type response_optimization: dict(str, object)

        """
        self.swagger_types = {
            'method': 'str',
            'url': 'str',
            'headers': 'dict(str, str)',
            'params': 'dict(str, str)',
            'body': 'dict(str, object)',
            'timeout': 'int',
            'auth': 'Auth',
            'response_optimization': 'dict(str, object)'
        }

        self.attribute_map = {
            'method': 'method',
            'url': 'url',
            'headers': 'headers',
            'params': 'params',
            'body': 'body',
            'timeout': 'timeout',
            'auth': 'auth',
            'response_optimization': 'responseOptimization'
        }

        self._method = None
        self._url = None
        self._headers = None
        self._params = None
        self._body = None
        self._timeout = None
        self._auth = None
        self._response_optimization = None

    @property
    def method(self):
        """
        Gets the method of this HttpToolConfiguration.
        HTTP method (GET, POST, PUT, DELETE, PATCH)

        Allowed values for this property are: "GET", "POST", "PUT", "DELETE", "PATCH"


        :return: The method of this HttpToolConfiguration.
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method):
        """
        Sets the method of this HttpToolConfiguration.
        HTTP method (GET, POST, PUT, DELETE, PATCH)


        :param method: The method of this HttpToolConfiguration.
        :type: str
        """
        allowed_values = ["GET", "POST", "PUT", "DELETE", "PATCH"]
        if not value_allowed_none_or_none_sentinel(method, allowed_values):
            raise ValueError(
                "Invalid value for `method`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._method = method

    @property
    def url(self):
        """
        Gets the url of this HttpToolConfiguration.
        Target URL with optional {{variable}} templates


        :return: The url of this HttpToolConfiguration.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """
        Sets the url of this HttpToolConfiguration.
        Target URL with optional {{variable}} templates


        :param url: The url of this HttpToolConfiguration.
        :type: str
        """
        self._url = url

    @property
    def headers(self):
        """
        Gets the headers of this HttpToolConfiguration.
        Optional custom headers


        :return: The headers of this HttpToolConfiguration.
        :rtype: dict(str, str)
        """
        return self._headers

    @headers.setter
    def headers(self, headers):
        """
        Sets the headers of this HttpToolConfiguration.
        Optional custom headers


        :param headers: The headers of this HttpToolConfiguration.
        :type: dict(str, str)
        """
        self._headers = headers

    @property
    def params(self):
        """
        Gets the params of this HttpToolConfiguration.
        Optional query parameters


        :return: The params of this HttpToolConfiguration.
        :rtype: dict(str, str)
        """
        return self._params

    @params.setter
    def params(self, params):
        """
        Sets the params of this HttpToolConfiguration.
        Optional query parameters


        :param params: The params of this HttpToolConfiguration.
        :type: dict(str, str)
        """
        self._params = params

    @property
    def body(self):
        """
        Gets the body of this HttpToolConfiguration.
        Optional request body (for POST, PUT, PATCH)


        :return: The body of this HttpToolConfiguration.
        :rtype: dict(str, object)
        """
        return self._body

    @body.setter
    def body(self, body):
        """
        Sets the body of this HttpToolConfiguration.
        Optional request body (for POST, PUT, PATCH)


        :param body: The body of this HttpToolConfiguration.
        :type: dict(str, object)
        """
        self._body = body

    @property
    def timeout(self):
        """
        Gets the timeout of this HttpToolConfiguration.
        Request timeout in seconds


        :return: The timeout of this HttpToolConfiguration.
        :rtype: int
        """
        return self._timeout

    @timeout.setter
    def timeout(self, timeout):
        """
        Sets the timeout of this HttpToolConfiguration.
        Request timeout in seconds


        :param timeout: The timeout of this HttpToolConfiguration.
        :type: int
        """
        self._timeout = timeout

    @property
    def auth(self):
        """
        Gets the auth of this HttpToolConfiguration.

        :return: The auth of this HttpToolConfiguration.
        :rtype: oci.aidataplatform_dp.models.Auth
        """
        return self._auth

    @auth.setter
    def auth(self, auth):
        """
        Sets the auth of this HttpToolConfiguration.

        :param auth: The auth of this HttpToolConfiguration.
        :type: oci.aidataplatform_dp.models.Auth
        """
        self._auth = auth

    @property
    def response_optimization(self):
        """
        Gets the response_optimization of this HttpToolConfiguration.
        Response optimization settings


        :return: The response_optimization of this HttpToolConfiguration.
        :rtype: dict(str, object)
        """
        return self._response_optimization

    @response_optimization.setter
    def response_optimization(self, response_optimization):
        """
        Sets the response_optimization of this HttpToolConfiguration.
        Response optimization settings


        :param response_optimization: The response_optimization of this HttpToolConfiguration.
        :type: dict(str, object)
        """
        self._response_optimization = response_optimization

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
