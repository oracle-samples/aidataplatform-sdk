# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LogExperimentRunModelDetails(object):
    """
    Details of an experiment run model.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LogExperimentRunModelDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this LogExperimentRunModelDetails.
        :type run_id: str

        :param model_json:
            The value to assign to the model_json property of this LogExperimentRunModelDetails.
        :type model_json: str

        """
        self.swagger_types = {
            'run_id': 'str',
            'model_json': 'str'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'model_json': 'model_json'
        }

        self._run_id = None
        self._model_json = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this LogExperimentRunModelDetails.
        Unique identifier for the run.


        :return: The run_id of this LogExperimentRunModelDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this LogExperimentRunModelDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this LogExperimentRunModelDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def model_json(self):
        """
        **[Required]** Gets the model_json of this LogExperimentRunModelDetails.
        Model file in JSON format


        :return: The model_json of this LogExperimentRunModelDetails.
        :rtype: str
        """
        return self._model_json

    @model_json.setter
    def model_json(self, model_json):
        """
        Sets the model_json of this LogExperimentRunModelDetails.
        Model file in JSON format


        :param model_json: The model_json of this LogExperimentRunModelDetails.
        :type: str
        """
        self._model_json = model_json

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
