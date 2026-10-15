# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LineageImportLog(object):
    """
    Diagnostic log entry produced while processing a lineage import.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LineageImportLog object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this LineageImportLog.
        :type key: str

        :param time_created:
            The value to assign to the time_created property of this LineageImportLog.
        :type time_created: datetime

        :param log_type:
            The value to assign to the log_type property of this LineageImportLog.
        :type log_type: str

        :param message:
            The value to assign to the message property of this LineageImportLog.
        :type message: str

        """
        self.swagger_types = {
            'key': 'str',
            'time_created': 'datetime',
            'log_type': 'str',
            'message': 'str'
        }
        self.attribute_map = {
            'key': 'key',
            'time_created': 'timeCreated',
            'log_type': 'logType',
            'message': 'message'
        }
        self._key = None
        self._time_created = None
        self._log_type = None
        self._message = None

    @property
    def key(self):
        """
        Gets the key of this LineageImportLog.
        Generated identifier for the log entry.


        :return: The key of this LineageImportLog.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this LineageImportLog.
        Generated identifier for the log entry.


        :param key: The key of this LineageImportLog.
        :type: str
        """
        self._key = key

    @property
    def time_created(self):
        """
        Gets the time_created of this LineageImportLog.
        Time the log entry was created.


        :return: The time_created of this LineageImportLog.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this LineageImportLog.
        Time the log entry was created.


        :param time_created: The time_created of this LineageImportLog.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def log_type(self):
        """
        Gets the log_type of this LineageImportLog.
        Type of diagnostic log entry.


        :return: The log_type of this LineageImportLog.
        :rtype: str
        """
        return self._log_type

    @log_type.setter
    def log_type(self, log_type):
        """
        Sets the log_type of this LineageImportLog.
        Type of diagnostic log entry.


        :param log_type: The log_type of this LineageImportLog.
        :type: str
        """
        self._log_type = log_type

    @property
    def message(self):
        """
        Gets the message of this LineageImportLog.
        Human-readable diagnostic message.


        :return: The message of this LineageImportLog.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this LineageImportLog.
        Human-readable diagnostic message.


        :param message: The message of this LineageImportLog.
        :type: str
        """
        self._message = message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
