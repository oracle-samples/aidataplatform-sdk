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

        :param headers:
            The value to assign to the headers property of this HttpResult.
        :type headers: dict(str, str)

        :param body:
            The value to assign to the body property of this HttpResult.
        :type body: dict(str, object)

        """
        self.swagger_types = {
            'status_code': 'int',
            'headers': 'dict(str, str)',
            'body': 'dict(str, object)'
        }

        self.attribute_map = {
            'status_code': 'statusCode',
            'headers': 'headers',
            'body': 'body'
        }

        self._status_code = None
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
