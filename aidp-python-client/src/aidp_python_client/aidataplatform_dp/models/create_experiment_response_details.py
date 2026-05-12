# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateExperimentResponseDetails(object):
    """
    Response object for creating an experiment
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateExperimentResponseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment_id:
            The value to assign to the experiment_id property of this CreateExperimentResponseDetails.
        :type experiment_id: str

        """
        self.swagger_types = {
            'experiment_id': 'str'
        }

        self.attribute_map = {
            'experiment_id': 'experiment_id'
        }

        self._experiment_id = None

    @property
    def experiment_id(self):
        """
        **[Required]** Gets the experiment_id of this CreateExperimentResponseDetails.
        Unique identifier for the experiment.


        :return: The experiment_id of this CreateExperimentResponseDetails.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this CreateExperimentResponseDetails.
        Unique identifier for the experiment.


        :param experiment_id: The experiment_id of this CreateExperimentResponseDetails.
        :type: str
        """
        self._experiment_id = experiment_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
