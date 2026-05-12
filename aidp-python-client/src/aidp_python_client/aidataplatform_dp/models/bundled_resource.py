# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BundledResource(object):
    """
    Descriptor for a workspace resource (Job/Agentflow) to include in a bundle.
    """

    #: A constant which can be used with the resource_type property of a BundledResource.
    #: This constant has a value of "JOB"
    RESOURCE_TYPE_JOB = "JOB"

    #: A constant which can be used with the resource_type property of a BundledResource.
    #: This constant has a value of "AGENTFLOW"
    RESOURCE_TYPE_AGENTFLOW = "AGENTFLOW"

    def __init__(self, **kwargs):
        """
        Initializes a new BundledResource object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param resource_type:
            The value to assign to the resource_type property of this BundledResource.
            Allowed values for this property are: "JOB", "AGENTFLOW"
        :type resource_type: str

        :param resource_key:
            The value to assign to the resource_key property of this BundledResource.
        :type resource_key: str

        """
        self.swagger_types = {
            'resource_type': 'str',
            'resource_key': 'str'
        }

        self.attribute_map = {
            'resource_type': 'resourceType',
            'resource_key': 'resourceKey'
        }

        self._resource_type = None
        self._resource_key = None

    @property
    def resource_type(self):
        """
        **[Required]** Gets the resource_type of this BundledResource.
        Type of resource (job or agentflow)

        Allowed values for this property are: "JOB", "AGENTFLOW"


        :return: The resource_type of this BundledResource.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type):
        """
        Sets the resource_type of this BundledResource.
        Type of resource (job or agentflow)


        :param resource_type: The resource_type of this BundledResource.
        :type: str
        """
        allowed_values = ["JOB", "AGENTFLOW"]
        if not value_allowed_none_or_none_sentinel(resource_type, allowed_values):
            raise ValueError(
                "Invalid value for `resource_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._resource_type = resource_type

    @property
    def resource_key(self):
        """
        **[Required]** Gets the resource_key of this BundledResource.
        Workspace unique key for the resource


        :return: The resource_key of this BundledResource.
        :rtype: str
        """
        return self._resource_key

    @resource_key.setter
    def resource_key(self, resource_key):
        """
        Sets the resource_key of this BundledResource.
        Workspace unique key for the resource


        :param resource_key: The resource_key of this BundledResource.
        :type: str
        """
        self._resource_key = resource_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
