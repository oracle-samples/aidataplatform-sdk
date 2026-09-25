# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntityError(object):
    """
    Entity mutation error details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntityError object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param code:
            The value to assign to the code property of this OntologyEntityError.
        :type code: str

        :param error_message:
            The value to assign to the error_message property of this OntologyEntityError.
        :type error_message: str

        """
        self.swagger_types = {
            'code': 'str',
            'error_message': 'str'
        }

        self.attribute_map = {
            'code': 'code',
            'error_message': 'errorMessage'
        }

        self._code = None
        self._error_message = None

    @property
    def code(self):
        """
        Gets the code of this OntologyEntityError.
        Machine-readable error code.


        :return: The code of this OntologyEntityError.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this OntologyEntityError.
        Machine-readable error code.


        :param code: The code of this OntologyEntityError.
        :type: str
        """
        self._code = code

    @property
    def error_message(self):
        """
        Gets the error_message of this OntologyEntityError.
        Human-readable error message.


        :return: The error_message of this OntologyEntityError.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """
        Sets the error_message of this OntologyEntityError.
        Human-readable error message.


        :param error_message: The error_message of this OntologyEntityError.
        :type: str
        """
        self._error_message = error_message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
