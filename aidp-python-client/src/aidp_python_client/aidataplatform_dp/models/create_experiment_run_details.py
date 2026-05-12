# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateExperimentRunDetails(object):
    """
    Details of run to create.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateExperimentRunDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_name:
            The value to assign to the run_name property of this CreateExperimentRunDetails.
        :type run_name: str

        :param experiment_id:
            The value to assign to the experiment_id property of this CreateExperimentRunDetails.
        :type experiment_id: str

        :param start_time:
            The value to assign to the start_time property of this CreateExperimentRunDetails.
        :type start_time: int

        :param tags:
            The value to assign to the tags property of this CreateExperimentRunDetails.
        :type tags: list[oci.aidataplatform_dp.models.ExperimentRunTag]

        """
        self.swagger_types = {
            'run_name': 'str',
            'experiment_id': 'str',
            'start_time': 'int',
            'tags': 'list[ExperimentRunTag]'
        }

        self.attribute_map = {
            'run_name': 'run_name',
            'experiment_id': 'experiment_id',
            'start_time': 'start_time',
            'tags': 'tags'
        }

        self._run_name = None
        self._experiment_id = None
        self._start_time = None
        self._tags = None

    @property
    def run_name(self):
        """
        Gets the run_name of this CreateExperimentRunDetails.
        Name of the run.


        :return: The run_name of this CreateExperimentRunDetails.
        :rtype: str
        """
        return self._run_name

    @run_name.setter
    def run_name(self, run_name):
        """
        Sets the run_name of this CreateExperimentRunDetails.
        Name of the run.


        :param run_name: The run_name of this CreateExperimentRunDetails.
        :type: str
        """
        self._run_name = run_name

    @property
    def experiment_id(self):
        """
        Gets the experiment_id of this CreateExperimentRunDetails.
        ID of the associated experiment.


        :return: The experiment_id of this CreateExperimentRunDetails.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this CreateExperimentRunDetails.
        ID of the associated experiment.


        :param experiment_id: The experiment_id of this CreateExperimentRunDetails.
        :type: str
        """
        self._experiment_id = experiment_id

    @property
    def start_time(self):
        """
        Gets the start_time of this CreateExperimentRunDetails.
        Unix timestamp in milliseconds when the run started.


        :return: The start_time of this CreateExperimentRunDetails.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this CreateExperimentRunDetails.
        Unix timestamp in milliseconds when the run started.


        :param start_time: The start_time of this CreateExperimentRunDetails.
        :type: int
        """
        self._start_time = start_time

    @property
    def tags(self):
        """
        Gets the tags of this CreateExperimentRunDetails.
        Tags to log.


        :return: The tags of this CreateExperimentRunDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this CreateExperimentRunDetails.
        Tags to log.


        :param tags: The tags of this CreateExperimentRunDetails.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunTag]
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
