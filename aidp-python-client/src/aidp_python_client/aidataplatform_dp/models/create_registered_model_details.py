# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateRegisteredModelDetails(object):
    """
    The data to create a RegisteredModel.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateRegisteredModelDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this CreateRegisteredModelDetails.
        :type name: str

        :param tags:
            The value to assign to the tags property of this CreateRegisteredModelDetails.
        :type tags: list[oci.aidataplatform_dp.models.RegisteredModelTag]

        :param description:
            The value to assign to the description property of this CreateRegisteredModelDetails.
        :type description: str

        :param deployment_job_id:
            The value to assign to the deployment_job_id property of this CreateRegisteredModelDetails.
        :type deployment_job_id: str

        """
        self.swagger_types = {
            'name': 'str',
            'tags': 'list[RegisteredModelTag]',
            'description': 'str',
            'deployment_job_id': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'tags': 'tags',
            'description': 'description',
            'deployment_job_id': 'deployment_job_id'
        }

        self._name = None
        self._tags = None
        self._description = None
        self._deployment_job_id = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this CreateRegisteredModelDetails.
        Register models under this name.


        :return: The name of this CreateRegisteredModelDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CreateRegisteredModelDetails.
        Register models under this name.


        :param name: The name of this CreateRegisteredModelDetails.
        :type: str
        """
        self._name = name

    @property
    def tags(self):
        """
        Gets the tags of this CreateRegisteredModelDetails.
        Tags for the registered model.


        :return: The tags of this CreateRegisteredModelDetails.
        :rtype: list[oci.aidataplatform_dp.models.RegisteredModelTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this CreateRegisteredModelDetails.
        Tags for the registered model.


        :param tags: The tags of this CreateRegisteredModelDetails.
        :type: list[oci.aidataplatform_dp.models.RegisteredModelTag]
        """
        self._tags = tags

    @property
    def description(self):
        """
        Gets the description of this CreateRegisteredModelDetails.
        Description for the registered model.


        :return: The description of this CreateRegisteredModelDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateRegisteredModelDetails.
        Description for the registered model.


        :param description: The description of this CreateRegisteredModelDetails.
        :type: str
        """
        self._description = description

    @property
    def deployment_job_id(self):
        """
        Gets the deployment_job_id of this CreateRegisteredModelDetails.
        Deployment job id for this model.


        :return: The deployment_job_id of this CreateRegisteredModelDetails.
        :rtype: str
        """
        return self._deployment_job_id

    @deployment_job_id.setter
    def deployment_job_id(self, deployment_job_id):
        """
        Sets the deployment_job_id of this CreateRegisteredModelDetails.
        Deployment job id for this model.


        :param deployment_job_id: The deployment_job_id of this CreateRegisteredModelDetails.
        :type: str
        """
        self._deployment_job_id = deployment_job_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
