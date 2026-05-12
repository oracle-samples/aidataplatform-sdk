# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Experiment(object):
    """
    Details of an MLflow experiment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new Experiment object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment_id:
            The value to assign to the experiment_id property of this Experiment.
        :type experiment_id: str

        :param name:
            The value to assign to the name property of this Experiment.
        :type name: str

        :param artifact_location:
            The value to assign to the artifact_location property of this Experiment.
        :type artifact_location: str

        :param lifecycle_stage:
            The value to assign to the lifecycle_stage property of this Experiment.
        :type lifecycle_stage: str

        :param creation_time:
            The value to assign to the creation_time property of this Experiment.
        :type creation_time: int

        :param last_update_time:
            The value to assign to the last_update_time property of this Experiment.
        :type last_update_time: int

        :param tags:
            The value to assign to the tags property of this Experiment.
        :type tags: list[oci.aidataplatform_dp.models.ExperimentTag]

        """
        self.swagger_types = {
            'experiment_id': 'str',
            'name': 'str',
            'artifact_location': 'str',
            'lifecycle_stage': 'str',
            'creation_time': 'int',
            'last_update_time': 'int',
            'tags': 'list[ExperimentTag]'
        }

        self.attribute_map = {
            'experiment_id': 'experiment_id',
            'name': 'name',
            'artifact_location': 'artifact_location',
            'lifecycle_stage': 'lifecycle_stage',
            'creation_time': 'creation_time',
            'last_update_time': 'last_update_time',
            'tags': 'tags'
        }

        self._experiment_id = None
        self._name = None
        self._artifact_location = None
        self._lifecycle_stage = None
        self._creation_time = None
        self._last_update_time = None
        self._tags = None

    @property
    def experiment_id(self):
        """
        **[Required]** Gets the experiment_id of this Experiment.
        Unique identifier for the experiment.


        :return: The experiment_id of this Experiment.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this Experiment.
        Unique identifier for the experiment.


        :param experiment_id: The experiment_id of this Experiment.
        :type: str
        """
        self._experiment_id = experiment_id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this Experiment.
        Name of the experiment.


        :return: The name of this Experiment.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Experiment.
        Name of the experiment.


        :param name: The name of this Experiment.
        :type: str
        """
        self._name = name

    @property
    def artifact_location(self):
        """
        Gets the artifact_location of this Experiment.
        Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.


        :return: The artifact_location of this Experiment.
        :rtype: str
        """
        return self._artifact_location

    @artifact_location.setter
    def artifact_location(self, artifact_location):
        """
        Sets the artifact_location of this Experiment.
        Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.


        :param artifact_location: The artifact_location of this Experiment.
        :type: str
        """
        self._artifact_location = artifact_location

    @property
    def lifecycle_stage(self):
        """
        Gets the lifecycle_stage of this Experiment.
        Lifecycle stage of the experiment, e.g., 'active' or 'deleted'.


        :return: The lifecycle_stage of this Experiment.
        :rtype: str
        """
        return self._lifecycle_stage

    @lifecycle_stage.setter
    def lifecycle_stage(self, lifecycle_stage):
        """
        Sets the lifecycle_stage of this Experiment.
        Lifecycle stage of the experiment, e.g., 'active' or 'deleted'.


        :param lifecycle_stage: The lifecycle_stage of this Experiment.
        :type: str
        """
        self._lifecycle_stage = lifecycle_stage

    @property
    def creation_time(self):
        """
        Gets the creation_time of this Experiment.
        Unix timestamp in milliseconds when the experiment was created.


        :return: The creation_time of this Experiment.
        :rtype: int
        """
        return self._creation_time

    @creation_time.setter
    def creation_time(self, creation_time):
        """
        Sets the creation_time of this Experiment.
        Unix timestamp in milliseconds when the experiment was created.


        :param creation_time: The creation_time of this Experiment.
        :type: int
        """
        self._creation_time = creation_time

    @property
    def last_update_time(self):
        """
        Gets the last_update_time of this Experiment.
        Unix timestamp in milliseconds when the experiment was last updated.


        :return: The last_update_time of this Experiment.
        :rtype: int
        """
        return self._last_update_time

    @last_update_time.setter
    def last_update_time(self, last_update_time):
        """
        Sets the last_update_time of this Experiment.
        Unix timestamp in milliseconds when the experiment was last updated.


        :param last_update_time: The last_update_time of this Experiment.
        :type: int
        """
        self._last_update_time = last_update_time

    @property
    def tags(self):
        """
        Gets the tags of this Experiment.
        List of tags set on the experiment.


        :return: The tags of this Experiment.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this Experiment.
        List of tags set on the experiment.


        :param tags: The tags of this Experiment.
        :type: list[oci.aidataplatform_dp.models.ExperimentTag]
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
