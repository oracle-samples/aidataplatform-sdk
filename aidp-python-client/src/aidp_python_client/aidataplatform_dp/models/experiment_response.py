# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExperimentResponse(object):
    """
    Response object for getting an experiment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExperimentResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment:
            The value to assign to the experiment property of this ExperimentResponse.
        :type experiment: oci.aidataplatform_dp.models.Experiment

        """
        self.swagger_types = {
            'experiment': 'Experiment'
        }

        self.attribute_map = {
            'experiment': 'experiment'
        }

        self._experiment = None

    @property
    def experiment(self):
        """
        **[Required]** Gets the experiment of this ExperimentResponse.

        :return: The experiment of this ExperimentResponse.
        :rtype: oci.aidataplatform_dp.models.Experiment
        """
        return self._experiment

    @experiment.setter
    def experiment(self, experiment):
        """
        Sets the experiment of this ExperimentResponse.

        :param experiment: The experiment of this ExperimentResponse.
        :type: oci.aidataplatform_dp.models.Experiment
        """
        self._experiment = experiment

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
