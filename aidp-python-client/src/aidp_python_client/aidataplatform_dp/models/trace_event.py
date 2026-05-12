# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TraceEvent(object):
    """
    event object details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TraceEvent object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this TraceEvent.
        :type name: str

        :param timestamp:
            The value to assign to the timestamp property of this TraceEvent.
        :type timestamp: datetime

        :param attributes:
            The value to assign to the attributes property of this TraceEvent.
        :type attributes: dict(str, object)

        """
        self.swagger_types = {
            'name': 'str',
            'timestamp': 'datetime',
            'attributes': 'dict(str, object)'
        }

        self.attribute_map = {
            'name': 'name',
            'timestamp': 'timestamp',
            'attributes': 'attributes'
        }

        self._name = None
        self._timestamp = None
        self._attributes = None

    @property
    def name(self):
        """
        Gets the name of this TraceEvent.
        event name


        :return: The name of this TraceEvent.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this TraceEvent.
        event name


        :param name: The name of this TraceEvent.
        :type: str
        """
        self._name = name

    @property
    def timestamp(self):
        """
        Gets the timestamp of this TraceEvent.
        event start time


        :return: The timestamp of this TraceEvent.
        :rtype: datetime
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """
        Sets the timestamp of this TraceEvent.
        event start time


        :param timestamp: The timestamp of this TraceEvent.
        :type: datetime
        """
        self._timestamp = timestamp

    @property
    def attributes(self):
        """
        Gets the attributes of this TraceEvent.
        event attributes


        :return: The attributes of this TraceEvent.
        :rtype: dict(str, object)
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes):
        """
        Sets the attributes of this TraceEvent.
        event attributes


        :param attributes: The attributes of this TraceEvent.
        :type: dict(str, object)
        """
        self._attributes = attributes

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
