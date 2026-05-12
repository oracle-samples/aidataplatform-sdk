# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelParameterResponse(object):
    """
    Details of each Model Parameter
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelParameterResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param maximum_output_tokens:
            The value to assign to the maximum_output_tokens property of this ModelParameterResponse.
        :type maximum_output_tokens: oci.aidataplatform_dp.models.ModelParameterDetail

        :param temperature:
            The value to assign to the temperature property of this ModelParameterResponse.
        :type temperature: oci.aidataplatform_dp.models.ModelParameterDetail

        :param top_p:
            The value to assign to the top_p property of this ModelParameterResponse.
        :type top_p: oci.aidataplatform_dp.models.ModelParameterDetail

        :param top_k:
            The value to assign to the top_k property of this ModelParameterResponse.
        :type top_k: oci.aidataplatform_dp.models.ModelParameterDetail

        :param frequency_penalty:
            The value to assign to the frequency_penalty property of this ModelParameterResponse.
        :type frequency_penalty: oci.aidataplatform_dp.models.ModelParameterDetail

        :param presence_penalty:
            The value to assign to the presence_penalty property of this ModelParameterResponse.
        :type presence_penalty: oci.aidataplatform_dp.models.ModelParameterDetail

        :param seed:
            The value to assign to the seed property of this ModelParameterResponse.
        :type seed: oci.aidataplatform_dp.models.ModelParameterDetail

        :param reasoning_effort:
            The value to assign to the reasoning_effort property of this ModelParameterResponse.
        :type reasoning_effort: oci.aidataplatform_dp.models.ModelParameterDetail

        :param number_of_generations:
            The value to assign to the number_of_generations property of this ModelParameterResponse.
        :type number_of_generations: oci.aidataplatform_dp.models.ModelParameterDetail

        :param truncate:
            The value to assign to the truncate property of this ModelParameterResponse.
        :type truncate: oci.aidataplatform_dp.models.ModelParameterDetail

        :param preamble_override:
            The value to assign to the preamble_override property of this ModelParameterResponse.
        :type preamble_override: oci.aidataplatform_dp.models.ModelParameterDetail

        :param safety_mode:
            The value to assign to the safety_mode property of this ModelParameterResponse.
        :type safety_mode: oci.aidataplatform_dp.models.ModelParameterDetail

        """
        self.swagger_types = {
            'maximum_output_tokens': 'ModelParameterDetail',
            'temperature': 'ModelParameterDetail',
            'top_p': 'ModelParameterDetail',
            'top_k': 'ModelParameterDetail',
            'frequency_penalty': 'ModelParameterDetail',
            'presence_penalty': 'ModelParameterDetail',
            'seed': 'ModelParameterDetail',
            'reasoning_effort': 'ModelParameterDetail',
            'number_of_generations': 'ModelParameterDetail',
            'truncate': 'ModelParameterDetail',
            'preamble_override': 'ModelParameterDetail',
            'safety_mode': 'ModelParameterDetail'
        }

        self.attribute_map = {
            'maximum_output_tokens': 'maximumOutputTokens',
            'temperature': 'temperature',
            'top_p': 'topP',
            'top_k': 'topK',
            'frequency_penalty': 'frequencyPenalty',
            'presence_penalty': 'presencePenalty',
            'seed': 'seed',
            'reasoning_effort': 'reasoningEffort',
            'number_of_generations': 'numberOfGenerations',
            'truncate': 'truncate',
            'preamble_override': 'preambleOverride',
            'safety_mode': 'safetyMode'
        }

        self._maximum_output_tokens = None
        self._temperature = None
        self._top_p = None
        self._top_k = None
        self._frequency_penalty = None
        self._presence_penalty = None
        self._seed = None
        self._reasoning_effort = None
        self._number_of_generations = None
        self._truncate = None
        self._preamble_override = None
        self._safety_mode = None

    @property
    def maximum_output_tokens(self):
        """
        Gets the maximum_output_tokens of this ModelParameterResponse.

        :return: The maximum_output_tokens of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._maximum_output_tokens

    @maximum_output_tokens.setter
    def maximum_output_tokens(self, maximum_output_tokens):
        """
        Sets the maximum_output_tokens of this ModelParameterResponse.

        :param maximum_output_tokens: The maximum_output_tokens of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._maximum_output_tokens = maximum_output_tokens

    @property
    def temperature(self):
        """
        Gets the temperature of this ModelParameterResponse.

        :return: The temperature of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._temperature

    @temperature.setter
    def temperature(self, temperature):
        """
        Sets the temperature of this ModelParameterResponse.

        :param temperature: The temperature of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._temperature = temperature

    @property
    def top_p(self):
        """
        Gets the top_p of this ModelParameterResponse.

        :return: The top_p of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._top_p

    @top_p.setter
    def top_p(self, top_p):
        """
        Sets the top_p of this ModelParameterResponse.

        :param top_p: The top_p of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._top_p = top_p

    @property
    def top_k(self):
        """
        Gets the top_k of this ModelParameterResponse.

        :return: The top_k of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._top_k

    @top_k.setter
    def top_k(self, top_k):
        """
        Sets the top_k of this ModelParameterResponse.

        :param top_k: The top_k of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._top_k = top_k

    @property
    def frequency_penalty(self):
        """
        Gets the frequency_penalty of this ModelParameterResponse.

        :return: The frequency_penalty of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._frequency_penalty

    @frequency_penalty.setter
    def frequency_penalty(self, frequency_penalty):
        """
        Sets the frequency_penalty of this ModelParameterResponse.

        :param frequency_penalty: The frequency_penalty of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._frequency_penalty = frequency_penalty

    @property
    def presence_penalty(self):
        """
        Gets the presence_penalty of this ModelParameterResponse.

        :return: The presence_penalty of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._presence_penalty

    @presence_penalty.setter
    def presence_penalty(self, presence_penalty):
        """
        Sets the presence_penalty of this ModelParameterResponse.

        :param presence_penalty: The presence_penalty of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._presence_penalty = presence_penalty

    @property
    def seed(self):
        """
        Gets the seed of this ModelParameterResponse.

        :return: The seed of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._seed

    @seed.setter
    def seed(self, seed):
        """
        Sets the seed of this ModelParameterResponse.

        :param seed: The seed of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._seed = seed

    @property
    def reasoning_effort(self):
        """
        Gets the reasoning_effort of this ModelParameterResponse.

        :return: The reasoning_effort of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._reasoning_effort

    @reasoning_effort.setter
    def reasoning_effort(self, reasoning_effort):
        """
        Sets the reasoning_effort of this ModelParameterResponse.

        :param reasoning_effort: The reasoning_effort of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._reasoning_effort = reasoning_effort

    @property
    def number_of_generations(self):
        """
        Gets the number_of_generations of this ModelParameterResponse.

        :return: The number_of_generations of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._number_of_generations

    @number_of_generations.setter
    def number_of_generations(self, number_of_generations):
        """
        Sets the number_of_generations of this ModelParameterResponse.

        :param number_of_generations: The number_of_generations of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._number_of_generations = number_of_generations

    @property
    def truncate(self):
        """
        Gets the truncate of this ModelParameterResponse.

        :return: The truncate of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._truncate

    @truncate.setter
    def truncate(self, truncate):
        """
        Sets the truncate of this ModelParameterResponse.

        :param truncate: The truncate of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._truncate = truncate

    @property
    def preamble_override(self):
        """
        Gets the preamble_override of this ModelParameterResponse.

        :return: The preamble_override of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._preamble_override

    @preamble_override.setter
    def preamble_override(self, preamble_override):
        """
        Sets the preamble_override of this ModelParameterResponse.

        :param preamble_override: The preamble_override of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._preamble_override = preamble_override

    @property
    def safety_mode(self):
        """
        Gets the safety_mode of this ModelParameterResponse.

        :return: The safety_mode of this ModelParameterResponse.
        :rtype: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        return self._safety_mode

    @safety_mode.setter
    def safety_mode(self, safety_mode):
        """
        Sets the safety_mode of this ModelParameterResponse.

        :param safety_mode: The safety_mode of this ModelParameterResponse.
        :type: oci.aidataplatform_dp.models.ModelParameterDetail
        """
        self._safety_mode = safety_mode

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
