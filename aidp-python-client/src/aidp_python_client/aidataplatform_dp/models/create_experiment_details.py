# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateExperimentDetails(object):
    """
    The data to create an experiment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateExperimentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this CreateExperimentDetails.
        :type name: str

        :param artifact_location:
            The value to assign to the artifact_location property of this CreateExperimentDetails.
        :type artifact_location: str

        :param tags:
            The value to assign to the tags property of this CreateExperimentDetails.
        :type tags: list[oci.aidataplatform_dp.models.ExperimentTag]

        """
        self.swagger_types = {
            'name': 'str',
            'artifact_location': 'str',
            'tags': 'list[ExperimentTag]'
        }

        self.attribute_map = {
            'name': 'name',
            'artifact_location': 'artifact_location',
            'tags': 'tags'
        }

        self._name = None
        self._artifact_location = None
        self._tags = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this CreateExperimentDetails.
        Name of the experiment.


        :return: The name of this CreateExperimentDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CreateExperimentDetails.
        Name of the experiment.


        :param name: The name of this CreateExperimentDetails.
        :type: str
        """
        self._name = name

    @property
    def artifact_location(self):
        """
        Gets the artifact_location of this CreateExperimentDetails.
        Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.


        :return: The artifact_location of this CreateExperimentDetails.
        :rtype: str
        """
        return self._artifact_location

    @artifact_location.setter
    def artifact_location(self, artifact_location):
        """
        Sets the artifact_location of this CreateExperimentDetails.
        Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.


        :param artifact_location: The artifact_location of this CreateExperimentDetails.
        :type: str
        """
        self._artifact_location = artifact_location

    @property
    def tags(self):
        """
        Gets the tags of this CreateExperimentDetails.
        List of tags set on the experiment.


        :return: The tags of this CreateExperimentDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this CreateExperimentDetails.
        List of tags set on the experiment.


        :param tags: The tags of this CreateExperimentDetails.
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
