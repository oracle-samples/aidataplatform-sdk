# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BundlePublishLocation(object):
    """
    Resolved bundle publish location for the last publish operation.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new BundlePublishLocation object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this BundlePublishLocation.
        :type path: str

        :param overwrite:
            The value to assign to the overwrite property of this BundlePublishLocation.
        :type overwrite: bool

        """
        self.swagger_types = {
            'path': 'str',
            'overwrite': 'bool'
        }

        self.attribute_map = {
            'path': 'path',
            'overwrite': 'overwrite'
        }

        self._path = None
        self._overwrite = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this BundlePublishLocation.
        Resolved publish root used by the bundle publish operation.


        :return: The path of this BundlePublishLocation.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this BundlePublishLocation.
        Resolved publish root used by the bundle publish operation.


        :param path: The path of this BundlePublishLocation.
        :type: str
        """
        self._path = path

    @property
    def overwrite(self):
        """
        Gets the overwrite of this BundlePublishLocation.
        Whether the publish operation was allowed to overwrite artifacts not owned by this bundle.


        :return: The overwrite of this BundlePublishLocation.
        :rtype: bool
        """
        return self._overwrite

    @overwrite.setter
    def overwrite(self, overwrite):
        """
        Sets the overwrite of this BundlePublishLocation.
        Whether the publish operation was allowed to overwrite artifacts not owned by this bundle.


        :param overwrite: The overwrite of this BundlePublishLocation.
        :type: bool
        """
        self._overwrite = overwrite

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
