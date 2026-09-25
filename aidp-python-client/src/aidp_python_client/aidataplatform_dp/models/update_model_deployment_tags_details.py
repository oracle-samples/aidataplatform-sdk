# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateModelDeploymentTagsDetails(object):
    """
    Details of the model deployment tags to update.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateModelDeploymentTagsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this UpdateModelDeploymentTagsDetails.
        :type deployment_id: str

        :param set_tags:
            The value to assign to the set_tags property of this UpdateModelDeploymentTagsDetails.
        :type set_tags: list[oci.aidataplatform_dp.models.ModelDeploymentTag]

        :param delete_tags:
            The value to assign to the delete_tags property of this UpdateModelDeploymentTagsDetails.
        :type delete_tags: list[oci.aidataplatform_dp.models.ModelDeploymentTagKey]

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'set_tags': 'list[ModelDeploymentTag]',
            'delete_tags': 'list[ModelDeploymentTagKey]'
        }

        self.attribute_map = {
            'deployment_id': 'deployment_id',
            'set_tags': 'set_tags',
            'delete_tags': 'delete_tags'
        }

        self._deployment_id = None
        self._set_tags = None
        self._delete_tags = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this UpdateModelDeploymentTagsDetails.
        ID of the deployment.


        :return: The deployment_id of this UpdateModelDeploymentTagsDetails.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this UpdateModelDeploymentTagsDetails.
        ID of the deployment.


        :param deployment_id: The deployment_id of this UpdateModelDeploymentTagsDetails.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def set_tags(self):
        """
        Gets the set_tags of this UpdateModelDeploymentTagsDetails.
        Model deployment tags to set.


        :return: The set_tags of this UpdateModelDeploymentTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.ModelDeploymentTag]
        """
        return self._set_tags

    @set_tags.setter
    def set_tags(self, set_tags):
        """
        Sets the set_tags of this UpdateModelDeploymentTagsDetails.
        Model deployment tags to set.


        :param set_tags: The set_tags of this UpdateModelDeploymentTagsDetails.
        :type: list[oci.aidataplatform_dp.models.ModelDeploymentTag]
        """
        self._set_tags = set_tags

    @property
    def delete_tags(self):
        """
        Gets the delete_tags of this UpdateModelDeploymentTagsDetails.
        Model deployment tags to delete.


        :return: The delete_tags of this UpdateModelDeploymentTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.ModelDeploymentTagKey]
        """
        return self._delete_tags

    @delete_tags.setter
    def delete_tags(self, delete_tags):
        """
        Sets the delete_tags of this UpdateModelDeploymentTagsDetails.
        Model deployment tags to delete.


        :param delete_tags: The delete_tags of this UpdateModelDeploymentTagsDetails.
        :type: list[oci.aidataplatform_dp.models.ModelDeploymentTagKey]
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
