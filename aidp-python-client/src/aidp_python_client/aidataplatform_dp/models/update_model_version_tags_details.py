# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateModelVersionTagsDetails(object):
    """
    Details of the ModelVersion tags to update.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateModelVersionTagsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this UpdateModelVersionTagsDetails.
        :type name: str

        :param version:
            The value to assign to the version property of this UpdateModelVersionTagsDetails.
        :type version: str

        :param set_tags:
            The value to assign to the set_tags property of this UpdateModelVersionTagsDetails.
        :type set_tags: list[oci.aidataplatform_dp.models.ModelVersionTag]

        :param delete_tags:
            The value to assign to the delete_tags property of this UpdateModelVersionTagsDetails.
        :type delete_tags: list[oci.aidataplatform_dp.models.ModelVersionTagKey]

        """
        self.swagger_types = {
            'name': 'str',
            'version': 'str',
            'set_tags': 'list[ModelVersionTag]',
            'delete_tags': 'list[ModelVersionTagKey]'
        }

        self.attribute_map = {
            'name': 'name',
            'version': 'version',
            'set_tags': 'set_tags',
            'delete_tags': 'delete_tags'
        }

        self._name = None
        self._version = None
        self._set_tags = None
        self._delete_tags = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this UpdateModelVersionTagsDetails.
        Name of the registered model.


        :return: The name of this UpdateModelVersionTagsDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdateModelVersionTagsDetails.
        Name of the registered model.


        :param name: The name of this UpdateModelVersionTagsDetails.
        :type: str
        """
        self._name = name

    @property
    def version(self):
        """
        **[Required]** Gets the version of this UpdateModelVersionTagsDetails.
        Model\u2019s version number.


        :return: The version of this UpdateModelVersionTagsDetails.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this UpdateModelVersionTagsDetails.
        Model\u2019s version number.


        :param version: The version of this UpdateModelVersionTagsDetails.
        :type: str
        """
        self._version = version

    @property
    def set_tags(self):
        """
        Gets the set_tags of this UpdateModelVersionTagsDetails.
        ModelVersion tags to set


        :return: The set_tags of this UpdateModelVersionTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.ModelVersionTag]
        """
        return self._set_tags

    @set_tags.setter
    def set_tags(self, set_tags):
        """
        Sets the set_tags of this UpdateModelVersionTagsDetails.
        ModelVersion tags to set


        :param set_tags: The set_tags of this UpdateModelVersionTagsDetails.
        :type: list[oci.aidataplatform_dp.models.ModelVersionTag]
        """
        self._set_tags = set_tags

    @property
    def delete_tags(self):
        """
        Gets the delete_tags of this UpdateModelVersionTagsDetails.
        ModelVersion tags to delete


        :return: The delete_tags of this UpdateModelVersionTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.ModelVersionTagKey]
        """
        return self._delete_tags

    @delete_tags.setter
    def delete_tags(self, delete_tags):
        """
        Sets the delete_tags of this UpdateModelVersionTagsDetails.
        ModelVersion tags to delete


        :param delete_tags: The delete_tags of this UpdateModelVersionTagsDetails.
        :type: list[oci.aidataplatform_dp.models.ModelVersionTagKey]
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
