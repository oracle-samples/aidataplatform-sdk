# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DiscoveryLocation(object):
    """
    Volume location for DOCUMENTS or TTL sources.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DiscoveryLocation object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param volume_key:
            The value to assign to the volume_key property of this DiscoveryLocation.
        :type volume_key: str

        :param paths:
            The value to assign to the paths property of this DiscoveryLocation.
        :type paths: list[str]

        """
        self.swagger_types = {
            'volume_key': 'str',
            'paths': 'list[str]'
        }
        self.attribute_map = {
            'volume_key': 'volumeKey',
            'paths': 'paths'
        }
        self._volume_key = None
        self._paths = None

    @property
    def volume_key(self):
        """
        Gets the volume_key of this DiscoveryLocation.
        Key of the workspace volume containing the source files.


        :return: The volume_key of this DiscoveryLocation.
        :rtype: str
        """
        return self._volume_key

    @volume_key.setter
    def volume_key(self, volume_key):
        """
        Sets the volume_key of this DiscoveryLocation.
        Key of the workspace volume containing the source files.


        :param volume_key: The volume_key of this DiscoveryLocation.
        :type: str
        """
        self._volume_key = volume_key

    @property
    def paths(self):
        """
        Gets the paths of this DiscoveryLocation.
        Volume-relative paths of the source files or folders.


        :return: The paths of this DiscoveryLocation.
        :rtype: list[str]
        """
        return self._paths

    @paths.setter
    def paths(self, paths):
        """
        Sets the paths of this DiscoveryLocation.
        Volume-relative paths of the source files or folders.


        :param paths: The paths of this DiscoveryLocation.
        :type: list[str]
        """
        self._paths = paths

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
