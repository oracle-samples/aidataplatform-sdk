# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateRegisteredModelDetails(object):
    """
    The data to update a RegisteredModel.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateRegisteredModelDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this UpdateRegisteredModelDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this UpdateRegisteredModelDetails.
        :type description: str

        :param deployment_job_id:
            The value to assign to the deployment_job_id property of this UpdateRegisteredModelDetails.
        :type deployment_job_id: str

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'deployment_job_id': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'deployment_job_id': 'deployment_job_id'
        }

        self._name = None
        self._description = None
        self._deployment_job_id = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this UpdateRegisteredModelDetails.
        Registered model unique name.


        :return: The name of this UpdateRegisteredModelDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdateRegisteredModelDetails.
        Registered model unique name.


        :param name: The name of this UpdateRegisteredModelDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this UpdateRegisteredModelDetails.
        Description for the registered model.


        :return: The description of this UpdateRegisteredModelDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateRegisteredModelDetails.
        Description for the registered model.


        :param description: The description of this UpdateRegisteredModelDetails.
        :type: str
        """
        self._description = description

    @property
    def deployment_job_id(self):
        """
        Gets the deployment_job_id of this UpdateRegisteredModelDetails.
        Deployment job id for this model.


        :return: The deployment_job_id of this UpdateRegisteredModelDetails.
        :rtype: str
        """
        return self._deployment_job_id

    @deployment_job_id.setter
    def deployment_job_id(self, deployment_job_id):
        """
        Sets the deployment_job_id of this UpdateRegisteredModelDetails.
        Deployment job id for this model.


        :param deployment_job_id: The deployment_job_id of this UpdateRegisteredModelDetails.
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
