# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentLogMessage(object):
    """
    The log event's message, subject to redaction and size limits.
    """

    #: A constant which can be used with the state property of a DeploymentLogMessage.
    #: This constant has a value of "AVAILABLE"
    STATE_AVAILABLE = "AVAILABLE"

    #: A constant which can be used with the state property of a DeploymentLogMessage.
    #: This constant has a value of "REDACTED"
    STATE_REDACTED = "REDACTED"

    #: A constant which can be used with the state property of a DeploymentLogMessage.
    #: This constant has a value of "NOT_AUTHORIZED"
    STATE_NOT_AUTHORIZED = "NOT_AUTHORIZED"

    #: A constant which can be used with the state property of a DeploymentLogMessage.
    #: This constant has a value of "UNKNOWN"
    STATE_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentLogMessage object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param state:
            The value to assign to the state property of this DeploymentLogMessage.
            Allowed values for this property are: "AVAILABLE", "REDACTED", "NOT_AUTHORIZED", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type state: str

        :param text:
            The value to assign to the text property of this DeploymentLogMessage.
        :type text: str

        :param is_truncated:
            The value to assign to the is_truncated property of this DeploymentLogMessage.
        :type is_truncated: bool

        """
        self.swagger_types = {
            'state': 'str',
            'text': 'str',
            'is_truncated': 'bool'
        }
        self.attribute_map = {
            'state': 'state',
            'text': 'text',
            'is_truncated': 'isTruncated'
        }
        self._state = None
        self._text = None
        self._is_truncated = None

    @property
    def state(self):
        """
        **[Required]** Gets the state of this DeploymentLogMessage.
        Whether the message text is available. Text is only present for AVAILABLE.

        Allowed values for this property are: "AVAILABLE", "REDACTED", "NOT_AUTHORIZED", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The state of this DeploymentLogMessage.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this DeploymentLogMessage.
        Whether the message text is available. Text is only present for AVAILABLE.


        :param state: The state of this DeploymentLogMessage.
        :type: str
        """
        allowed_values = ["AVAILABLE", "REDACTED", "NOT_AUTHORIZED", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(state, allowed_values):
            state = 'UNKNOWN_ENUM_VALUE'
        self._state = state

    @property
    def text(self):
        """
        Gets the text of this DeploymentLogMessage.
        Display text of the log event. Treat as untrusted display data. Null when the state denies or lacks content.


        :return: The text of this DeploymentLogMessage.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """
        Sets the text of this DeploymentLogMessage.
        Display text of the log event. Treat as untrusted display data. Null when the state denies or lacks content.


        :param text: The text of this DeploymentLogMessage.
        :type: str
        """
        self._text = text

    @property
    def is_truncated(self):
        """
        **[Required]** Gets the is_truncated of this DeploymentLogMessage.
        Whether the text was truncated to the size limit.


        :return: The is_truncated of this DeploymentLogMessage.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated):
        """
        Sets the is_truncated of this DeploymentLogMessage.
        Whether the text was truncated to the size limit.


        :param is_truncated: The is_truncated of this DeploymentLogMessage.
        :type: bool
        """
        self._is_truncated = is_truncated

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
