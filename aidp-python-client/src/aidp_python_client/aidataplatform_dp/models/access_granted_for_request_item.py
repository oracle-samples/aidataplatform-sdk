# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForRequestItem(object):
    """
    One resource and requested access type.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForRequestItem object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param resource:
            The value to assign to the resource property of this AccessGrantedForRequestItem.
        :type resource: oci.aidataplatform_dp.models.AccessGrantedForResource

        :param access_type:
            The value to assign to the access_type property of this AccessGrantedForRequestItem.
        :type access_type: str

        """
        self.swagger_types = {
            'resource': 'AccessGrantedForResource',
            'access_type': 'str'
        }
        self.attribute_map = {
            'resource': 'resource',
            'access_type': 'accessType'
        }
        self._resource = None
        self._access_type = None

    @property
    def resource(self):
        """
        **[Required]** Gets the resource of this AccessGrantedForRequestItem.

        :return: The resource of this AccessGrantedForRequestItem.
        :rtype: oci.aidataplatform_dp.models.AccessGrantedForResource
        """
        return self._resource

    @resource.setter
    def resource(self, resource):
        """
        Sets the resource of this AccessGrantedForRequestItem.

        :param resource: The resource of this AccessGrantedForRequestItem.
        :type: oci.aidataplatform_dp.models.AccessGrantedForResource
        """
        self._resource = resource

    @property
    def access_type(self):
        """
        **[Required]** Gets the access_type of this AccessGrantedForRequestItem.
        Lakeproxy access type for the selected resource.


        :return: The access_type of this AccessGrantedForRequestItem.
        :rtype: str
        """
        return self._access_type

    @access_type.setter
    def access_type(self, access_type):
        """
        Sets the access_type of this AccessGrantedForRequestItem.
        Lakeproxy access type for the selected resource.


        :param access_type: The access_type of this AccessGrantedForRequestItem.
        :type: str
        """
        self._access_type = access_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
