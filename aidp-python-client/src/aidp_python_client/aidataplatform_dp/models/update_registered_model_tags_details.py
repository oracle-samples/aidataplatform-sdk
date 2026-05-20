# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateRegisteredModelTagsDetails(object):
    """
    Details of the registered model tags to update.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateRegisteredModelTagsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this UpdateRegisteredModelTagsDetails.
        :type name: str

        :param set_tags:
            The value to assign to the set_tags property of this UpdateRegisteredModelTagsDetails.
        :type set_tags: list[oci.aidataplatform_dp.models.RegisteredModelTag]

        :param delete_tags:
            The value to assign to the delete_tags property of this UpdateRegisteredModelTagsDetails.
        :type delete_tags: list[oci.aidataplatform_dp.models.RegisteredModelTagKey]

        """
        self.swagger_types = {
            'name': 'str',
            'set_tags': 'list[RegisteredModelTag]',
            'delete_tags': 'list[RegisteredModelTagKey]'
        }

        self.attribute_map = {
            'name': 'name',
            'set_tags': 'set_tags',
            'delete_tags': 'delete_tags'
        }

        self._name = None
        self._set_tags = None
        self._delete_tags = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this UpdateRegisteredModelTagsDetails.
        Name of the registered model.


        :return: The name of this UpdateRegisteredModelTagsDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdateRegisteredModelTagsDetails.
        Name of the registered model.


        :param name: The name of this UpdateRegisteredModelTagsDetails.
        :type: str
        """
        self._name = name

    @property
    def set_tags(self):
        """
        Gets the set_tags of this UpdateRegisteredModelTagsDetails.
        Registered model tags to set.


        :return: The set_tags of this UpdateRegisteredModelTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.RegisteredModelTag]
        """
        return self._set_tags

    @set_tags.setter
    def set_tags(self, set_tags):
        """
        Sets the set_tags of this UpdateRegisteredModelTagsDetails.
        Registered model tags to set.


        :param set_tags: The set_tags of this UpdateRegisteredModelTagsDetails.
        :type: list[oci.aidataplatform_dp.models.RegisteredModelTag]
        """
        self._set_tags = set_tags

    @property
    def delete_tags(self):
        """
        Gets the delete_tags of this UpdateRegisteredModelTagsDetails.
        Registered model tags to delete.


        :return: The delete_tags of this UpdateRegisteredModelTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.RegisteredModelTagKey]
        """
        return self._delete_tags

    @delete_tags.setter
    def delete_tags(self, delete_tags):
        """
        Sets the delete_tags of this UpdateRegisteredModelTagsDetails.
        Registered model tags to delete.


        :param delete_tags: The delete_tags of this UpdateRegisteredModelTagsDetails.
        :type: list[oci.aidataplatform_dp.models.RegisteredModelTagKey]
        """
        self._delete_tags = delete_tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
