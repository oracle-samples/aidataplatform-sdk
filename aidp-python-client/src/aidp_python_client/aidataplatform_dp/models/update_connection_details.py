# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateConnectionDetails(object):
    """
    The details of a connection associated with a catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateConnectionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param connection_properties:
            The value to assign to the connection_properties property of this UpdateConnectionDetails.
        :type connection_properties: dict(str, str)

        """
        self.swagger_types = {
            'connection_properties': 'dict(str, str)'
        }

        self.attribute_map = {
            'connection_properties': 'connectionProperties'
        }

        self._connection_properties = None

    @property
    def connection_properties(self):
        """
        **[Required]** Gets the connection_properties of this UpdateConnectionDetails.
        Connection properties.


        :return: The connection_properties of this UpdateConnectionDetails.
        :rtype: dict(str, str)
        """
        return self._connection_properties

    @connection_properties.setter
    def connection_properties(self, connection_properties):
        """
        Sets the connection_properties of this UpdateConnectionDetails.
        Connection properties.


        :param connection_properties: The connection_properties of this UpdateConnectionDetails.
        :type: dict(str, str)
        """
        self._connection_properties = connection_properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
