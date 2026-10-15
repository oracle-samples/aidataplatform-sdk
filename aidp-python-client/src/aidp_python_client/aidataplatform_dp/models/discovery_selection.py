# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DiscoverySelection(object):
    """
    DiscoverySelection model.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DiscoverySelection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param include:
            The value to assign to the include property of this DiscoverySelection.
        :type include: list[str]

        :param exclude:
            The value to assign to the exclude property of this DiscoverySelection.
        :type exclude: list[str]

        :param limit:
            The value to assign to the limit property of this DiscoverySelection.
        :type limit: int

        """
        self.swagger_types = {
            'include': 'list[str]',
            'exclude': 'list[str]',
            'limit': 'int'
        }
        self.attribute_map = {
            'include': 'include',
            'exclude': 'exclude',
            'limit': 'limit'
        }
        self._include = None
        self._exclude = None
        self._limit = None

    @property
    def include(self):
        """
        Gets the include of this DiscoverySelection.

        :return: The include of this DiscoverySelection.
        :rtype: list[str]
        """
        return self._include

    @include.setter
    def include(self, include):
        """
        Sets the include of this DiscoverySelection.

        :param include: The include of this DiscoverySelection.
        :type: list[str]
        """
        self._include = include

    @property
    def exclude(self):
        """
        Gets the exclude of this DiscoverySelection.

        :return: The exclude of this DiscoverySelection.
        :rtype: list[str]
        """
        return self._exclude

    @exclude.setter
    def exclude(self, exclude):
        """
        Sets the exclude of this DiscoverySelection.

        :param exclude: The exclude of this DiscoverySelection.
        :type: list[str]
        """
        self._exclude = exclude

    @property
    def limit(self):
        """
        Gets the limit of this DiscoverySelection.

        :return: The limit of this DiscoverySelection.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """
        Sets the limit of this DiscoverySelection.

        :param limit: The limit of this DiscoverySelection.
        :type: int
        """
        self._limit = limit

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
