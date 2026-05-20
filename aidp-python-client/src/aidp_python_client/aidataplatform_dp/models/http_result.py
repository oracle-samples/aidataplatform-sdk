# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class HttpResult(object):
    """
    Result from HTTP tool execution.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new HttpResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param status_code:
            The value to assign to the status_code property of this HttpResult.
        :type status_code: int

        :param error_code:
            The value to assign to the error_code property of this HttpResult.
        :type error_code: str

        :param message:
            The value to assign to the message property of this HttpResult.
        :type message: str

        :param is_network_error:
            The value to assign to the is_network_error property of this HttpResult.
        :type is_network_error: bool

        :param elapsed_seconds:
            The value to assign to the elapsed_seconds property of this HttpResult.
        :type elapsed_seconds: float

        :param headers:
            The value to assign to the headers property of this HttpResult.
        :type headers: dict(str, str)

        :param body:
            The value to assign to the body property of this HttpResult.
        :type body: dict(str, object)

        """
        self.swagger_types = {
            'status_code': 'int',
            'error_code': 'str',
            'message': 'str',
            'is_network_error': 'bool',
            'elapsed_seconds': 'float',
            'headers': 'dict(str, str)',
            'body': 'dict(str, object)'
        }

        self.attribute_map = {
            'status_code': 'statusCode',
            'error_code': 'errorCode',
            'message': 'message',
            'is_network_error': 'isNetworkError',
            'elapsed_seconds': 'elapsedSeconds',
            'headers': 'headers',
            'body': 'body'
        }

        self._status_code = None
        self._error_code = None
        self._message = None
        self._is_network_error = None
        self._elapsed_seconds = None
        self._headers = None
        self._body = None

    @property
    def status_code(self):
        """
        Gets the status_code of this HttpResult.
        HTTP response status code


        :return: The status_code of this HttpResult.
        :rtype: int
        """
        return self._status_code

    @status_code.setter
    def status_code(self, status_code):
        """
        Sets the status_code of this HttpResult.
        HTTP response status code


        :param status_code: The status_code of this HttpResult.
        :type: int
        """
        self._status_code = status_code

    @property
    def error_code(self):
        """
        Gets the error_code of this HttpResult.
        Tool-level error code describing HTTP test failures


        :return: The error_code of this HttpResult.
        :rtype: str
        """
        return self._error_code

    @error_code.setter
    def error_code(self, error_code):
        """
        Sets the error_code of this HttpResult.
        Tool-level error code describing HTTP test failures


        :param error_code: The error_code of this HttpResult.
        :type: str
        """
        self._error_code = error_code

    @property
    def message(self):
        """
        Gets the message of this HttpResult.
        Human-readable error message when the HTTP test fails


        :return: The message of this HttpResult.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this HttpResult.
        Human-readable error message when the HTTP test fails


        :param message: The message of this HttpResult.
        :type: str
        """
        self._message = message

    @property
    def is_network_error(self):
        """
        Gets the is_network_error of this HttpResult.
        Indicates whether the failure occurred before an HTTP response was received


        :return: The is_network_error of this HttpResult.
        :rtype: bool
        """
        return self._is_network_error

    @is_network_error.setter
    def is_network_error(self, is_network_error):
        """
        Sets the is_network_error of this HttpResult.
        Indicates whether the failure occurred before an HTTP response was received


        :param is_network_error: The is_network_error of this HttpResult.
        :type: bool
        """
        self._is_network_error = is_network_error

    @property
    def elapsed_seconds(self):
        """
        Gets the elapsed_seconds of this HttpResult.
        Time elapsed before the HTTP test completed or failed


        :return: The elapsed_seconds of this HttpResult.
        :rtype: float
        """
        return self._elapsed_seconds

    @elapsed_seconds.setter
    def elapsed_seconds(self, elapsed_seconds):
        """
        Sets the elapsed_seconds of this HttpResult.
        Time elapsed before the HTTP test completed or failed


        :param elapsed_seconds: The elapsed_seconds of this HttpResult.
        :type: float
        """
        self._elapsed_seconds = elapsed_seconds

    @property
    def headers(self):
        """
        Gets the headers of this HttpResult.
        Response headers


        :return: The headers of this HttpResult.
        :rtype: dict(str, str)
        """
        return self._headers

    @headers.setter
    def headers(self, headers):
        """
        Sets the headers of this HttpResult.
        Response headers


        :param headers: The headers of this HttpResult.
        :type: dict(str, str)
        """
        self._headers = headers

    @property
    def body(self):
        """
        Gets the body of this HttpResult.
        Response body


        :return: The body of this HttpResult.
        :rtype: dict(str, object)
        """
        return self._body

    @body.setter
    def body(self, body):
        """
        Sets the body of this HttpResult.
        Response body


        :param body: The body of this HttpResult.
        :type: dict(str, object)
        """
        self._body = body

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
