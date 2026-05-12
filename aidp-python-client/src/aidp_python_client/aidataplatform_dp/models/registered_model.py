# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RegisteredModel(object):
    """
    Details of the registered model
    """

    #: A constant which can be used with the deployment_job_state property of a RegisteredModel.
    #: This constant has a value of "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED"
    DEPLOYMENT_JOB_STATE_DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED = "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED"

    #: A constant which can be used with the deployment_job_state property of a RegisteredModel.
    #: This constant has a value of "NOT_SET_UP"
    DEPLOYMENT_JOB_STATE_NOT_SET_UP = "NOT_SET_UP"

    #: A constant which can be used with the deployment_job_state property of a RegisteredModel.
    #: This constant has a value of "CONNECTED"
    DEPLOYMENT_JOB_STATE_CONNECTED = "CONNECTED"

    #: A constant which can be used with the deployment_job_state property of a RegisteredModel.
    #: This constant has a value of "NOT_FOUND"
    DEPLOYMENT_JOB_STATE_NOT_FOUND = "NOT_FOUND"

    #: A constant which can be used with the deployment_job_state property of a RegisteredModel.
    #: This constant has a value of "REQUIRED_PARAMETERS_CHANGED"
    DEPLOYMENT_JOB_STATE_REQUIRED_PARAMETERS_CHANGED = "REQUIRED_PARAMETERS_CHANGED"

    def __init__(self, **kwargs):
        """
        Initializes a new RegisteredModel object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this RegisteredModel.
        :type name: str

        :param creation_timestamp:
            The value to assign to the creation_timestamp property of this RegisteredModel.
        :type creation_timestamp: int

        :param last_updated_timestamp:
            The value to assign to the last_updated_timestamp property of this RegisteredModel.
        :type last_updated_timestamp: int

        :param description:
            The value to assign to the description property of this RegisteredModel.
        :type description: str

        :param latest_versions:
            The value to assign to the latest_versions property of this RegisteredModel.
        :type latest_versions: list[oci.aidataplatform_dp.models.ModelVersion]

        :param aliases:
            The value to assign to the aliases property of this RegisteredModel.
        :type aliases: list[oci.aidataplatform_dp.models.RegisteredModelAlias]

        :param deployment_job_id:
            The value to assign to the deployment_job_id property of this RegisteredModel.
        :type deployment_job_id: str

        :param deployment_job_state:
            The value to assign to the deployment_job_state property of this RegisteredModel.
            Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type deployment_job_state: str

        :param tags:
            The value to assign to the tags property of this RegisteredModel.
        :type tags: list[oci.aidataplatform_dp.models.RegisteredModelTag]

        """
        self.swagger_types = {
            'name': 'str',
            'creation_timestamp': 'int',
            'last_updated_timestamp': 'int',
            'description': 'str',
            'latest_versions': 'list[ModelVersion]',
            'aliases': 'list[RegisteredModelAlias]',
            'deployment_job_id': 'str',
            'deployment_job_state': 'str',
            'tags': 'list[RegisteredModelTag]'
        }

        self.attribute_map = {
            'name': 'name',
            'creation_timestamp': 'creation_timestamp',
            'last_updated_timestamp': 'last_updated_timestamp',
            'description': 'description',
            'latest_versions': 'latest_versions',
            'aliases': 'aliases',
            'deployment_job_id': 'deployment_job_id',
            'deployment_job_state': 'deployment_job_state',
            'tags': 'tags'
        }

        self._name = None
        self._creation_timestamp = None
        self._last_updated_timestamp = None
        self._description = None
        self._latest_versions = None
        self._aliases = None
        self._deployment_job_id = None
        self._deployment_job_state = None
        self._tags = None

    @property
    def name(self):
        """
        Gets the name of this RegisteredModel.
        Unique name for the model.


        :return: The name of this RegisteredModel.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this RegisteredModel.
        Unique name for the model.


        :param name: The name of this RegisteredModel.
        :type: str
        """
        self._name = name

    @property
    def creation_timestamp(self):
        """
        Gets the creation_timestamp of this RegisteredModel.
        Timestamp in milliseconds when the model was created.


        :return: The creation_timestamp of this RegisteredModel.
        :rtype: int
        """
        return self._creation_timestamp

    @creation_timestamp.setter
    def creation_timestamp(self, creation_timestamp):
        """
        Sets the creation_timestamp of this RegisteredModel.
        Timestamp in milliseconds when the model was created.


        :param creation_timestamp: The creation_timestamp of this RegisteredModel.
        :type: int
        """
        self._creation_timestamp = creation_timestamp

    @property
    def last_updated_timestamp(self):
        """
        Gets the last_updated_timestamp of this RegisteredModel.
        Timestamp in milliseconds when metadata for the model was last updated.


        :return: The last_updated_timestamp of this RegisteredModel.
        :rtype: int
        """
        return self._last_updated_timestamp

    @last_updated_timestamp.setter
    def last_updated_timestamp(self, last_updated_timestamp):
        """
        Sets the last_updated_timestamp of this RegisteredModel.
        Timestamp in milliseconds when metadata for the model was last updated.


        :param last_updated_timestamp: The last_updated_timestamp of this RegisteredModel.
        :type: int
        """
        self._last_updated_timestamp = last_updated_timestamp

    @property
    def description(self):
        """
        Gets the description of this RegisteredModel.
        Description of the registered model.


        :return: The description of this RegisteredModel.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this RegisteredModel.
        Description of the registered model.


        :param description: The description of this RegisteredModel.
        :type: str
        """
        self._description = description

    @property
    def latest_versions(self):
        """
        Gets the latest_versions of this RegisteredModel.
        Collection of latest model versions for each stage. Only contains models with current READY status.


        :return: The latest_versions of this RegisteredModel.
        :rtype: list[oci.aidataplatform_dp.models.ModelVersion]
        """
        return self._latest_versions

    @latest_versions.setter
    def latest_versions(self, latest_versions):
        """
        Sets the latest_versions of this RegisteredModel.
        Collection of latest model versions for each stage. Only contains models with current READY status.


        :param latest_versions: The latest_versions of this RegisteredModel.
        :type: list[oci.aidataplatform_dp.models.ModelVersion]
        """
        self._latest_versions = latest_versions

    @property
    def aliases(self):
        """
        Gets the aliases of this RegisteredModel.
        Aliases pointing to model versions associated with this registered_model.


        :return: The aliases of this RegisteredModel.
        :rtype: list[oci.aidataplatform_dp.models.RegisteredModelAlias]
        """
        return self._aliases

    @aliases.setter
    def aliases(self, aliases):
        """
        Sets the aliases of this RegisteredModel.
        Aliases pointing to model versions associated with this registered_model.


        :param aliases: The aliases of this RegisteredModel.
        :type: list[oci.aidataplatform_dp.models.RegisteredModelAlias]
        """
        self._aliases = aliases

    @property
    def deployment_job_id(self):
        """
        Gets the deployment_job_id of this RegisteredModel.
        Deployment job ID.


        :return: The deployment_job_id of this RegisteredModel.
        :rtype: str
        """
        return self._deployment_job_id

    @deployment_job_id.setter
    def deployment_job_id(self, deployment_job_id):
        """
        Sets the deployment_job_id of this RegisteredModel.
        Deployment job ID.


        :param deployment_job_id: The deployment_job_id of this RegisteredModel.
        :type: str
        """
        self._deployment_job_id = deployment_job_id

    @property
    def deployment_job_state(self):
        """
        Gets the deployment_job_state of this RegisteredModel.
        Job state.

        Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The deployment_job_state of this RegisteredModel.
        :rtype: str
        """
        return self._deployment_job_state

    @deployment_job_state.setter
    def deployment_job_state(self, deployment_job_state):
        """
        Sets the deployment_job_state of this RegisteredModel.
        Job state.


        :param deployment_job_state: The deployment_job_state of this RegisteredModel.
        :type: str
        """
        allowed_values = ["DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED"]
        if not value_allowed_none_or_none_sentinel(deployment_job_state, allowed_values):
            deployment_job_state = 'UNKNOWN_ENUM_VALUE'
        self._deployment_job_state = deployment_job_state

    @property
    def tags(self):
        """
        Gets the tags of this RegisteredModel.
        Tags for the registered model.


        :return: The tags of this RegisteredModel.
        :rtype: list[oci.aidataplatform_dp.models.RegisteredModelTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this RegisteredModel.
        Tags for the registered model.


        :param tags: The tags of this RegisteredModel.
        :type: list[oci.aidataplatform_dp.models.RegisteredModelTag]
        """
        self._tags = tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
