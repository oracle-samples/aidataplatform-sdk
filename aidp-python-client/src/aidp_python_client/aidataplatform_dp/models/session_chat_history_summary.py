# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SessionChatHistorySummary(object):
    """
    A single message in a chat session history. Does not include internal state.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SessionChatHistorySummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this SessionChatHistorySummary.
        :type key: str

        :param session_key:
            The value to assign to the session_key property of this SessionChatHistorySummary.
        :type session_key: str

        :param role:
            The value to assign to the role property of this SessionChatHistorySummary.
        :type role: str

        :param time_created:
            The value to assign to the time_created property of this SessionChatHistorySummary.
        :type time_created: datetime

        :param content:
            The value to assign to the content property of this SessionChatHistorySummary.
        :type content: list[oci.aidataplatform_dp.models.ChatMessage]

        :param tool_name:
            The value to assign to the tool_name property of this SessionChatHistorySummary.
        :type tool_name: str

        :param tool_call_id:
            The value to assign to the tool_call_id property of this SessionChatHistorySummary.
        :type tool_call_id: str

        :param metadata:
            The value to assign to the metadata property of this SessionChatHistorySummary.
        :type metadata: dict(str, object)

        """
        self.swagger_types = {
            'key': 'str',
            'session_key': 'str',
            'role': 'str',
            'time_created': 'datetime',
            'content': 'list[ChatMessage]',
            'tool_name': 'str',
            'tool_call_id': 'str',
            'metadata': 'dict(str, object)'
        }

        self.attribute_map = {
            'key': 'key',
            'session_key': 'sessionKey',
            'role': 'role',
            'time_created': 'timeCreated',
            'content': 'content',
            'tool_name': 'toolName',
            'tool_call_id': 'toolCallId',
            'metadata': 'metadata'
        }

        self._key = None
        self._session_key = None
        self._role = None
        self._time_created = None
        self._content = None
        self._tool_name = None
        self._tool_call_id = None
        self._metadata = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this SessionChatHistorySummary.
        Unique identifier for the message.


        :return: The key of this SessionChatHistorySummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this SessionChatHistorySummary.
        Unique identifier for the message.


        :param key: The key of this SessionChatHistorySummary.
        :type: str
        """
        self._key = key

    @property
    def session_key(self):
        """
        **[Required]** Gets the session_key of this SessionChatHistorySummary.
        Identifier of the chat session this message belongs to.


        :return: The session_key of this SessionChatHistorySummary.
        :rtype: str
        """
        return self._session_key

    @session_key.setter
    def session_key(self, session_key):
        """
        Sets the session_key of this SessionChatHistorySummary.
        Identifier of the chat session this message belongs to.


        :param session_key: The session_key of this SessionChatHistorySummary.
        :type: str
        """
        self._session_key = session_key

    @property
    def role(self):
        """
        **[Required]** Gets the role of this SessionChatHistorySummary.
        Role associated with the message, such as user, assistant, system, or tool.


        :return: The role of this SessionChatHistorySummary.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """
        Sets the role of this SessionChatHistorySummary.
        Role associated with the message, such as user, assistant, system, or tool.


        :param role: The role of this SessionChatHistorySummary.
        :type: str
        """
        self._role = role

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this SessionChatHistorySummary.
        Time the message was created.


        :return: The time_created of this SessionChatHistorySummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this SessionChatHistorySummary.
        Time the message was created.


        :param time_created: The time_created of this SessionChatHistorySummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def content(self):
        """
        **[Required]** Gets the content of this SessionChatHistorySummary.
        Message content.


        :return: The content of this SessionChatHistorySummary.
        :rtype: list[oci.aidataplatform_dp.models.ChatMessage]
        """
        return self._content

    @content.setter
    def content(self, content):
        """
        Sets the content of this SessionChatHistorySummary.
        Message content.


        :param content: The content of this SessionChatHistorySummary.
        :type: list[oci.aidataplatform_dp.models.ChatMessage]
        """
        self._content = content

    @property
    def tool_name(self):
        """
        Gets the tool_name of this SessionChatHistorySummary.
        Name of the tool, if this is a tool message.


        :return: The tool_name of this SessionChatHistorySummary.
        :rtype: str
        """
        return self._tool_name

    @tool_name.setter
    def tool_name(self, tool_name):
        """
        Sets the tool_name of this SessionChatHistorySummary.
        Name of the tool, if this is a tool message.


        :param tool_name: The tool_name of this SessionChatHistorySummary.
        :type: str
        """
        self._tool_name = tool_name

    @property
    def tool_call_id(self):
        """
        Gets the tool_call_id of this SessionChatHistorySummary.
        Identifier of the tool call, if applicable.


        :return: The tool_call_id of this SessionChatHistorySummary.
        :rtype: str
        """
        return self._tool_call_id

    @tool_call_id.setter
    def tool_call_id(self, tool_call_id):
        """
        Sets the tool_call_id of this SessionChatHistorySummary.
        Identifier of the tool call, if applicable.


        :param tool_call_id: The tool_call_id of this SessionChatHistorySummary.
        :type: str
        """
        self._tool_call_id = tool_call_id

    @property
    def metadata(self):
        """
        Gets the metadata of this SessionChatHistorySummary.
        Optional key-value metadata associated with the message


        :return: The metadata of this SessionChatHistorySummary.
        :rtype: dict(str, object)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """
        Sets the metadata of this SessionChatHistorySummary.
        Optional key-value metadata associated with the message


        :param metadata: The metadata of this SessionChatHistorySummary.
        :type: dict(str, object)
        """
        self._metadata = metadata

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
