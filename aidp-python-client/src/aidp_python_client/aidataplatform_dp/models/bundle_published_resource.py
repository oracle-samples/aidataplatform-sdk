# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BundlePublishedResource(object):
    """
    Published resource.
    """

    #: A constant which can be used with the type property of a BundlePublishedResource.
    #: This constant has a value of "JOB"
    TYPE_JOB = "JOB"

    #: A constant which can be used with the type property of a BundlePublishedResource.
    #: This constant has a value of "AGENTFLOW"
    TYPE_AGENTFLOW = "AGENTFLOW"

    def __init__(self, **kwargs):
        """
        Initializes a new BundlePublishedResource object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this BundlePublishedResource.
            Allowed values for this property are: "JOB", "AGENTFLOW", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param key:
            The value to assign to the key property of this BundlePublishedResource.
        :type key: str

        :param name:
            The value to assign to the name property of this BundlePublishedResource.
        :type name: str

        """
        self.swagger_types = {
            'type': 'str',
            'key': 'str',
            'name': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'key': 'key',
            'name': 'name'
        }

        self._type = None
        self._key = None
        self._name = None

    @property
    def type(self):
        """
        **[Required]** Gets the type of this BundlePublishedResource.
        Type of resource

        Allowed values for this property are: "JOB", "AGENTFLOW", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this BundlePublishedResource.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this BundlePublishedResource.
        Type of resource


        :param type: The type of this BundlePublishedResource.
        :type: str
        """
        allowed_values = ["JOB", "AGENTFLOW"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def key(self):
        """
        Gets the key of this BundlePublishedResource.
        Resource key.


        :return: The key of this BundlePublishedResource.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this BundlePublishedResource.
        Resource key.


        :param key: The key of this BundlePublishedResource.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        **[Required]** Gets the name of this BundlePublishedResource.
        Resource name


        :return: The name of this BundlePublishedResource.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this BundlePublishedResource.
        Resource name


        :param name: The name of this BundlePublishedResource.
        :type: str
        """
        self._name = name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
